package gameMechanics.moves;


import gameMechanics.Board;
import gameMechanics.Field;
import gameMechanics.pieces.Piece;

public class NonCapturingMove extends Move{

    public NonCapturingMove(Board board, Piece movedPiece, Field destinationField){
        super(board,movedPiece,destinationField);
    }
}
