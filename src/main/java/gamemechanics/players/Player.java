package gamemechanics.players;

import gamemechanics.Alliance;
import gamemechanics.Board;
import gamemechanics.Type;
import gamemechanics.moves.Move;
import gamemechanics.pieces.King;
import gamemechanics.pieces.Piece;

import java.util.List;

public abstract class Player {

    Board board;
    King KingOfPlayer;
    List<Move> legalMoves;

    Player(Board board, List<Move> legalMoves, List<Move> opponentMoves){

        this.board = board;
        this.KingOfPlayer = establishKing();
        this.legalMoves = legalMoves;

    }

    protected King establishKing(){
        King king = null;
        for(Piece piece:getActivePieces()){
            if(piece.getType()== Type.KING){
                king = (King)piece;
            }
        }
        return king;
    }

    public abstract List<Piece> getActivePieces();
    public abstract Alliance getAlliance();

    public boolean isMoveLegal(Move move){
        return this.legalMoves.contains(move);
    }

    public boolean isInCheck(){
        return false;
    }

    public boolean isInCheckMate(){
        return false;
    }

    public boolean isInStaleMate(){
        return false;
    }

    public MoveTransition makeMove(Move move){
        return null;
    }



}
