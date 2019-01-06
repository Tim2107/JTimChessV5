package gamemechanics.moves;

import gamemechanics.Board;
import gamemechanics.Field;
import gamemechanics.pieces.Piece;

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
