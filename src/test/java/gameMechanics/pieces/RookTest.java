package gameMechanics.pieces;

import gameMechanics.Alliance;
import gameMechanics.Board;
import gameMechanics.moves.Move;
import gameMechanics.testData.BishopTestDto;
import gameMechanics.testData.RookTestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static gameMechanics.Position.C1;
import static gameMechanics.Position.C4;
import static gameMechanics.Position.D4;
import static org.junit.jupiter.api.Assertions.*;

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