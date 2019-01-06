package gameMechanics.pieces;

import gameMechanics.*;
import gameMechanics.moves.Move;

import java.util.List;

public abstract class Piece {

   Type type;
   Alliance alliance;
   Position position;

   boolean isFirstMove;

   List<Piece> isAttackedBy;
   List<Piece> isDefendedBy;

   int isAttackedCounter;
   int isDefendedCounter;


    public Piece(Type type, Alliance alliance, Position position){
        this.type = type;
        this.alliance = alliance;
        this.position = position;
        this.isFirstMove = true;
    }

    public Type getType() {
        return type;
    }

    public Alliance getAlliance() {
        return alliance;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract List<Move> calculateLegalMoves(Board board);

    public boolean isFirstMove() {
        return isFirstMove;
    }
}
