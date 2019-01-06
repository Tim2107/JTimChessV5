package gameMechanics.pieces;

import gameMechanics.Alliance;
import gameMechanics.Board;
import gameMechanics.moves.Move;
import gameMechanics.testData.PawnTestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static gameMechanics.Position.*;
import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

    @Test
    void calculateLegalMovesTest(){
        PawnTestDto pawnTestDto = new PawnTestDto();
        List<Piece> piecePlacement = pawnTestDto.getPiecePlacement();
        Board testboard = new Board(piecePlacement);

        Pawn testPawn = new Pawn(Alliance.WHITE,D2);

        List<Move> legalMoves = testPawn.calculateLegalMoves(testboard);
        for (Move legalMove : legalMoves) {
            System.out.println(legalMove.getDestinationField().getPosition());

        }
    }

}