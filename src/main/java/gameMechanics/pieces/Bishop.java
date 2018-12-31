package gameMechanics.pieces;

import gameMechanics.*;

import java.util.List;

import static gameMechanics.Type.BISHOP;

public class Bishop extends Piece {
    public Bishop(Alliance alliance, Position position){
        super(BISHOP, alliance, position);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {
        return null;
    }
}
