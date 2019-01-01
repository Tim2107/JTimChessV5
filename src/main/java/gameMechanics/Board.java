package gameMechanics;


import gameMechanics.pieces.Piece;
import gameMechanics.utils.PositionTranslator;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public final static int BOARDLENGTH = 8;
    public final static int BOARDSIZE = BOARDLENGTH * BOARDLENGTH;

    private Field[][] boardGrid = new Field[BOARDLENGTH][BOARDLENGTH];
    private List<Field> fieldList = new ArrayList<>();
    private List<Piece> activePieces = new ArrayList<>();
    private List<Piece> activeWhitePieces = new ArrayList<>();
    private List<Piece> activeBlackPieces = new ArrayList<>();
    private List<Piece> benchedPieces = new ArrayList<>();

    public Board(List<Piece> initialPosition){
        initializeBoardGrid();
        initializeFieldList();
        setBoard(initialPosition);
        updateActivePieces();
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

    private void initializeFieldList(){
        for (int column = 0; column < BOARDLENGTH; column++) {
            for (int row = 0; row < BOARDLENGTH; row++) {
                fieldList.add(boardGrid[column][row]);
            }
        }
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
        PositionTranslator translator = new PositionTranslator(piece.getPosition(),null,null,null);
        Field field = boardGrid[translator.getColumn()][translator.getRow()];
        field.setIsOccupiedBy(piece);
    }

    public void removePieceFromField(Position fieldToClear){
        PositionTranslator translator = new PositionTranslator(fieldToClear,null,null,null);
        Field field = boardGrid[translator.getColumn()][translator.getRow()];
        field.setIsOccupiedBy(null);
    }

    public void setBoard(List<Piece> boardSetUpList){
        boardSetUpList.forEach(this::putPieceOnField);
    }

    public void updateActivePieces(){

        activePieces.clear();

        fieldList.stream()
                 .map(field -> field.getIsOccupiedBy())
                 .forEach(piece ->
                        {if (piece != null){
                            activePieces.add(piece);
                            }
                        }
                 );

        activeWhitePieces.clear();
        activeBlackPieces.clear();

        activePieces.forEach(piece ->
                            {if (piece.getAlliance() == Alliance.WHITE){
                                activeWhitePieces.add(piece);
                                }
                                else{
                                activeBlackPieces.add(piece);
                                }
                            }
                     );
    }

    public List<Piece> getActivePieces() {
        return activePieces;
    }

    public List<Piece> getActiveWhitePieces() {
        return activeWhitePieces;
    }

    public List<Piece> getActiveBlackPieces() {
        return activeBlackPieces;
    }

    public List<Piece> getBenchedPieces() {
        return benchedPieces;
    }

    public void setBenchedPieces(List<Piece> benchedPieces) {
        this.benchedPieces = benchedPieces;
    }

    public void addBenchedPiece(Piece piece){
        this.benchedPieces.add(piece);
    }
}
