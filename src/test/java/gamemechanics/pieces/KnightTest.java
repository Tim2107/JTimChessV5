package gamemechanics.pieces;

import gamemechanics.Alliance;
import gamemechanics.Board;
import gamemechanics.moves.Move;
import gamemechanics.testData.KnightTestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static gamemechanics.Position.D3;

class KnightTest {

    @Test
    void calculateLegalMovesTest(){
        KnightTestDto knightTestDto = new KnightTestDto();
        List<Piece> piecePlacement = knightTestDto.getPiecePlacement();
        Board testboard = new Board(piecePlacement);

        Knight testKnight = new Knight(Alliance.WHITE,D3);

        List<Move> legalMoves = testKnight.calculateLegalMoves(testboard);
        for (Move legalMove : legalMoves) {
            System.out.println(legalMove.getDestinationField().getPosition());

        }
    }

}