package gamemechanics.pieces;

import gamemechanics.Alliance;
import gamemechanics.Board;
import gamemechanics.moves.Move;
import gamemechanics.testData.KingTestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static gamemechanics.Position.B3;

class KingTest {

    @Test
    void calculateLegalMovesTest(){
        KingTestDto kingTestDto = new KingTestDto();
        List<Piece> piecePlacement = kingTestDto.getPiecePlacement();
        Board testboard = new Board(piecePlacement);

        King testKing = new King(Alliance.WHITE,B3);

        List<Move> legalMoves = testKing.calculateLegalMoves(testboard);
        for (Move legalMove : legalMoves) {
            System.out.println(legalMove.getDestinationField().getPosition());

        }
    }
}