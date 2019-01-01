package gameMechanics.pieces;

import gameMechanics.Alliance;
import gameMechanics.Board;
import gameMechanics.moves.Move;
import gameMechanics.testData.KnightTestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static gameMechanics.Position.D3;
import static gameMechanics.Position.D4;
import static gameMechanics.Position.E4;
import static org.junit.jupiter.api.Assertions.*;

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