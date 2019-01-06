package gamemechanics;

public class Arbiter {

    int turn = 1;

    Alliance playerToMove = Alliance.WHITE;

    boolean whiteQueenSideCastlePossible = false;
    boolean whiteKingSideCastlePossible = false;
    boolean blackQueenSideCastlePossible = false;
    boolean blackKingSideCastlePossible = false;

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public Alliance getPlayerToMove() {
        return playerToMove;
    }

    public void setPlayerToMove(Alliance playerToMove) {
        this.playerToMove = playerToMove;
    }

    public boolean isWhiteQueenSideCastlePossible() {
        return whiteQueenSideCastlePossible;
    }

    public void setWhiteQueenSideCastlePossible(boolean whiteQueenSideCastlePossible) {
        this.whiteQueenSideCastlePossible = whiteQueenSideCastlePossible;
    }

    public boolean isWhiteKingSideCastlePossible() {
        return whiteKingSideCastlePossible;
    }

    public void setWhiteKingSideCastlePossible(boolean whiteKingSideCastlePossible) {
        this.whiteKingSideCastlePossible = whiteKingSideCastlePossible;
    }

    public boolean isBlackQueenSideCastlePossible() {
        return blackQueenSideCastlePossible;
    }

    public void setBlackQueenSideCastlePossible(boolean blackQueenSideCastlePossible) {
        this.blackQueenSideCastlePossible = blackQueenSideCastlePossible;
    }

    public boolean isBlackKingSideCastlePossible() {
        return blackKingSideCastlePossible;
    }

    public void setBlackKingSideCastlePossible(boolean blackKingSideCastlePossible) {
        this.blackKingSideCastlePossible = blackKingSideCastlePossible;
    }
}
