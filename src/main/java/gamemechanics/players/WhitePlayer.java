package gamemechanics.players;

import gamemechanics.Alliance;
import gamemechanics.Board;
import gamemechanics.moves.Move;
import gamemechanics.pieces.Piece;

import java.util.List;

public class WhitePlayer extends Player{

   Alliance alliance = Alliance.WHITE;

    WhitePlayer(Board board, List<Move> whiteStandardLegalMoves, List<Move> blackStandardLegalMoves) {
        super(board, whiteStandardLegalMoves, blackStandardLegalMoves);
    }

    @Override
    public List<Piece> getActivePieces() {
        return this.board.getActiveWhitePieces();
    }

    public Alliance getAlliance() {
        return this.alliance;
    }
}
