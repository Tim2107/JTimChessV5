package gameMechanics.pieces;

import gameMechanics.Alliance;
import gameMechanics.Board;
import gameMechanics.moves.Move;
import gameMechanics.testData.QueenTestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static gameMechanics.Position.D4;
import static org.junit.jupiter.api.Assertions.*;

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