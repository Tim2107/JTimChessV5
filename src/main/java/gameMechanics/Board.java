package gameMechanics;


import gameMechanics.utils.PositionTranslator;

import java.util.ArrayList;
import java.util.List;

public class Board {

    final static int BOARDLENGTH = 8;
    final static int BOARDSIZE = BOARDLENGTH * BOARDLENGTH;

    private Field[][] boardGrid = new Field[BOARDLENGTH][BOARDLENGTH];
    private List<Piece> activePieces = new ArrayList<>();
    private List<Piece> benchedPieces = new ArrayList<>();

    public Board(){
        initializeBoardGrid();
    }

    private void initializeBoardGrid() {
        for (int column = 0; column < BOARDLENGTH; column++) {
            for (int row = 0; row < BOARDLENGTH; row++) {
                boardGrid[column][row] = initializeField(column, row);
            }
        }
    }

    private Field initializeField(int column, int row) {
        int asciiValue = 65 + column;
        String rowInAlgebraicNotation = Integer.toString(row + 1);
        String columnInAlgebraicNotation = String.valueOf((char)asciiValue);
        String algebraicNotationCoordinates = columnInAlgebraicNotation + rowInAlgebraicNotation;
        Field emptyField = new Field(Position.valueOf(algebraicNotationCoordinates), null);
        return emptyField;
    }

    public Field getField(Position algebraicNotation) {
        PositionTranslator translator = new PositionTranslator(algebraicNotation, null, null, null);
        return boardGrid[translator.getColumn()][translator.getRow()];
    }

    public Field getField(int column, int row) {
        return boardGrid[column][row];
    }

    public Field getField(int guiTileId) {
        PositionTranslator translator = new PositionTranslator(null, null, null, guiTileId);
        return boardGrid[translator.getColumn()][translator.getRow()];
    }

    public void putPieceOnField(Piece piece){
        PositionTranslator setBoardTranslator = new PositionTranslator(piece.getPosition(),null,null,null);
        boardGrid[setBoardTranslator.getColumn()][setBoardTranslator.getRow()].setIsOccupiedBy(piece);
    }




    public void updateActivePieces(){

                List<Field> fieldList = this.getListOfFieldsOnBoard();
        this.getListOfFieldsOnBoard()
                .stream()
                .map(field -> field.getIsOccupiedBy())
                .forEach(piece ->
                        {if (piece != null){
                            activePieces.add(piece);
                        }
                        }
                );
        return activePieces;
    }







}
