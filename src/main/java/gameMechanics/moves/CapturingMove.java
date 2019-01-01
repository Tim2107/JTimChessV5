package gameMechanics.moves;

import gameMechanics.Board;
import gameMechanics.Field;
import gameMechanics.pieces.Piece;

public class CapturingMove extends Move {

    Piece capturedPiece;

    public CapturingMove(Board board, Piece movedPiece, Field destinationField, Piece capturedPiece){
        super(board,movedPiece,destinationField);
        this.capturedPiece = capturedPiece;
    }

    public Piece getCapturedPiece() {
        return capturedPiece;
    }
}
