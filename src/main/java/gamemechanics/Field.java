package gamemechanics;

import gamemechanics.pieces.Piece;

import java.util.List;

public class Field {

    private final Position position;
    private Piece isOccupiedBy;

    private List<Piece> isAttackedBy;
    private List<Piece> isDefendedBy;

    private int isAttackedCounter;
    private int isDefendedCounter;


    public Field(Position position, Piece piece){
        this.position = position;
        this.isOccupiedBy = piece;
    }

    public Position getPosition() {
        return position;
    }

    public Piece getIsOccupiedBy() {
        return isOccupiedBy;
    }

    public void setIsOccupiedBy(Piece isOccupiedBy) {
        this.isOccupiedBy = isOccupiedBy;
    }
}
