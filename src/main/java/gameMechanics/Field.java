package gameMechanics;

public class Field {

    Position position;
    Piece isOccupiedBy;

    public Field(Position position, Piece piece){
        this.position = position;
        this.isOccupiedBy = piece;
    }
}
