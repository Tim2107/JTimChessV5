package gameMechanics.pieces;

import gameMechanics.Alliance;
import gameMechanics.Board;
import gameMechanics.moves.Move;
import gameMechanics.testData.KingTestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static gameMechanics.Position.B3;
import static gameMechanics.Position.D4;
import static org.junit.jupiter.api.Assertions.*;

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