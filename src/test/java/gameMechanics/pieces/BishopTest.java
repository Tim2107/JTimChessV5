package gameMechanics.pieces;

import gameMechanics.Alliance;
import gameMechanics.Board;
import gameMechanics.moves.Move;
import gameMechanics.testData.BishopTestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static gameMechanics.Position.C1;
import static org.junit.jupiter.api.Assertions.*;

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