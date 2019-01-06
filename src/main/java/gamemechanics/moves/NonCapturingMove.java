package gamemechanics.moves;


import gamemechanics.Board;
import gamemechanics.Field;
import gamemechanics.pieces.Piece;

public class NonCapturingMove extends Move{

    public NonCapturingMove(Board board, Piece movedPiece, Field destinationField){
        super(board,movedPiece,destinationField);
    }
}
