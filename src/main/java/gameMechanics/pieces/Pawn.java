package gameMechanics.pieces;

import gameMechanics.*;
import gameMechanics.moves.Move;

import java.util.List;

import static gameMechanics.Type.PAWN;

public class Pawn extends Piece{


    public Pawn (Alliance alliance, Position position){
        super(PAWN, alliance, position);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {
        return null;
    }
}
