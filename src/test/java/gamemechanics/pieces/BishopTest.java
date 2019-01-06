package gamemechanics.pieces;

import gamemechanics.Alliance;
import gamemechanics.Board;
import gamemechanics.moves.Move;
import gamemechanics.testData.BishopTestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static gamemechanics.Position.C1;

class BishopTest {

    @Test
    void calculateLegalMovesTest(){
        BishopTestDto bishopTestDto = new BishopTestDto();
        List<Piece> piecePlacement = bishopTestDto.getPiecePlacement();
        Board testboard = new Board(piecePlacement);

        Bishop testBishop = new Bishop(Alliance.WHITE,C1);

        List<Move> legalMoves = testBishop.calculateLegalMoves(testboard);
        for (Move legalMove : legalMoves) {
            System.out.println(legalMove.getDestinationField().getPosition());

        }
    }

}