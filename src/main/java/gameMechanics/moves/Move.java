package gameMechanics.moves;

import gameMechanics.Board;
import gameMechanics.Field;
import gameMechanics.pieces.Piece;

public abstract class Move {

    Board board;
    Piece movedPiece;
    Field destinationField;

    public Move(Board board, Piece movedPiece, Field destinationField){
        this.board = board;
        this.movedPiece = movedPiece;
        this.destinationField = destinationField;
    }

    public Piece getMovedPiece() {
        return movedPiece;
    }

    public Field getDestinationField() {
        return destinationField;
    }
}
