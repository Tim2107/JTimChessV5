package gamemechanics.pieces;

import gamemechanics.Alliance;
import gamemechanics.Board;
import gamemechanics.moves.Move;
import gamemechanics.testData.RookTestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static gamemechanics.Position.D4;

class RookTest {

    @Test
    void calculateLegalMovesTest(){
        RookTestDto rookTestDto = new RookTestDto();
        List<Piece> piecePlacement = rookTestDto.getPiecePlacement();
        Board testboard = new Board(piecePlacement);

        Rook testRook = new Rook(Alliance.WHITE,D4);

        List<Move> legalMoves = testRook.calculateLegalMoves(testboard);
        for (Move legalMove : legalMoves) {
            System.out.println(legalMove.getDestinationField().getPosition());

        }
    }
}