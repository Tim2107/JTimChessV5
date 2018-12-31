package gameMechanics.pieces;

import gameMechanics.*;

import java.util.List;

import static gameMechanics.Type.QUEEN;

public class Queen extends Piece {

    public Queen(Alliance alliance, Position position){
        super(QUEEN, alliance, position);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {
        return null;
    }
}
