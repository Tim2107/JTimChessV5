package gameMechanics.pieces;

import gameMechanics.*;

import java.util.List;

import static gameMechanics.Type.KNIGHT;

public class Knight extends Piece {

    public Knight(Alliance alliance, Position position){
        super(KNIGHT, alliance, position);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {
        return null;
    }
}
