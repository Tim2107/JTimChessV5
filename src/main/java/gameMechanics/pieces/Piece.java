package gameMechanics.pieces;

import gameMechanics.Alliance;
import gameMechanics.Position;
import gameMechanics.Type;

import java.util.List;

public abstract class Piece {

    private Type type;
    private Alliance alliance;
    private Position position;

    private List<Piece> isAttackedBy;
    private List<Piece> isDefendedBy;

    private int isAttackedCounter;
    private int isDefendedCounter;


    public Piece(Type type, Alliance alliance, Position position){
        this.type = type;
        this.alliance = alliance;
        this.position = position;
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
}
