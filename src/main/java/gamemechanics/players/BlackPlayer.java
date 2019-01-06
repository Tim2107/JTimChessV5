package gamemechanics.players;

import gamemechanics.Alliance;
import gamemechanics.Board;
import gamemechanics.moves.Move;
import gamemechanics.pieces.Piece;

import java.util.List;

public class BlackPlayer extends Player{


    Alliance alliance = Alliance.BLACK;

    public BlackPlayer(Board board, List<Move> whiteStandardLegalMoves, List<Move> blackStandardLegalMoves) {
        super(board,blackStandardLegalMoves,whiteStandardLegalMoves);
    }

    @Override
    public List<Piece> getActivePieces() {
        return this.board.getActiveBlackPieces();
    }

    @Override
    public Alliance getAlliance() {
        return this.alliance;
    }


}
