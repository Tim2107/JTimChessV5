package gameMechanics;

public class Piece {

    private Type type;
    private Alliance alliance;
    private Position position;


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
