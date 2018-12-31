package gameMechanics.pieces;

import gameMechanics.*;

import java.util.List;

import static gameMechanics.Type.KING;

public class King extends Piece {

    public King(Alliance alliance, Position position){
        super(KING, alliance, position);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {
        return null;
    }
}
