package gamemechanics.pieces;

import gamemechanics.Alliance;
import gamemechanics.Board;
import gamemechanics.moves.Move;
import gamemechanics.testData.QueenTestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static gamemechanics.Position.D4;

class QueenTest {

    @Test
    void calculateLegalMovesTest(){
        QueenTestDto queenTestDto = new QueenTestDto();
        List<Piece> piecePlacement = queenTestDto.getPiecePlacement();
        Board testboard = new Board(piecePlacement);

        Queen testQueen = new Queen(Alliance.WHITE,D4);

        List<Move> legalMoves = testQueen.calculateLegalMoves(testboard);
        for (Move legalMove : legalMoves) {
            System.out.println(legalMove.getDestinationField().getPosition());

        }
    }

}