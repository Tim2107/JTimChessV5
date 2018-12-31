package gameMechanics.pieces;

import gameMechanics.*;

import java.util.List;

import static gameMechanics.Type.ROOK;

public class Rook extends Piece{

    public Rook(Alliance alliance, Position position){
        super(ROOK, alliance, position);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {
        return null;
    }
}
