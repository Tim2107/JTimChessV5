package gameMechanics.utils;

import gameMechanics.Position;

import static java.lang.Math.abs;

public class PositionTranslator {

    //Todo test and error-handling for constructor inputs

    private Position algebraicNotation;
    private int columnInLogicGrid;
    private int rowInLogicGrid;
    private int guiTileId;

    public PositionTranslator(Position position, Integer column, Integer row, Integer tileId){

        if(position != null){
            this.algebraicNotation = position;
            convertAlgebraicNotationToColumnInGrid(position);
            convertAlgebraicNotationToRowInGrid(position);
            convertGridCoordinatesToGuiTileId(getColumn(), getRow());
        }

        if(row != null && column != null){
            this.columnInLogicGrid = column;
            this.rowInLogicGrid = row;
            convertGridCoordinatesToGuiTileId(column, row);
            convertGridCoordinatesToAlgebraicNotation(column,row);
        }

        if(tileId != null){
            this.guiTileId = tileId;
            convertGuiTileIdToGridCoordinates(tileId);
            convertGridCoordinatesToAlgebraicNotation(getColumn(), getRow());

        }
    }

    public void convertAlgebraicNotationToColumnInGrid(Position algebraicNotation) {
        String[] parsedPosition = algebraicNotation.toString().split("");
        Character column = parsedPosition[0].charAt(0);
        columnInLogicGrid = column - 'A';
    }

    public void convertAlgebraicNotationToRowInGrid(Position algebraicNotation) {
        String[] parsedPosition = algebraicNotation.toString().split("");
        int row = Integer.parseInt(parsedPosition[1]);
        rowInLogicGrid = row - 1;
    }

    public void convertGridCoordinatesToGuiTileId(int columnInGrid, int rowInGrid){
        int rowConversion = abs(rowInGrid - 7) * 8;
        guiTileId = rowConversion + columnInGrid;
    }

    public void convertGridCoordinatesToAlgebraicNotation(int columnInGrid, int rowInGrid){
        String positionColumn = Character.toString ((char) (columnInGrid + 65));
        String positionRow = Integer.toString(rowInGrid + 1);
        algebraicNotation = Position.valueOf(positionColumn + positionRow);
    }

    public void convertGuiTileIdToGridCoordinates(int tileId){
        columnInLogicGrid = tileId%8;
        rowInLogicGrid = 7 -((tileId - columnInLogicGrid)/8);
    }

    public Position getAlgebraicNotation() {
        return algebraicNotation;
    }

    public int getColumn() {
        return columnInLogicGrid;
    }

    public int getRow() {
        return rowInLogicGrid;
    }

    public int getGuiTileId() {
        return guiTileId;
    }
}
