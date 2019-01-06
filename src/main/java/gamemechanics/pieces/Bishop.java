package gamemechanics.pieces;

import gamemechanics.*;
import gamemechanics.moves.CapturingMove;
import gamemechanics.moves.Move;
import gamemechanics.moves.NonCapturingMove;
import gamemechanics.utils.PositionTranslator;

import java.util.ArrayList;
import java.util.List;

import static gamemechanics.Board.BOARDLENGTH;
import static gamemechanics.Type.BISHOP;

public class Bishop extends Piece {

    public Bishop(Alliance alliance, Position position){
        super(BISHOP, alliance, position);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {

        List<Move> legalMoves = new ArrayList<>();


        PositionTranslator translator = new PositionTranslator(position,null, null,null);
        int columnOfPosition = translator.getColumn();
        int rowOfPosition = translator.getRow();


        for (int  columnInMove = columnOfPosition + 1, rowInMove = rowOfPosition + 1;
             rowInMove < BOARDLENGTH && columnInMove < BOARDLENGTH;
             columnInMove++, rowInMove++) {

            if (!addBishopMoveForDirection(board, legalMoves, columnInMove, rowInMove)) break;
        }

        for (int rowInMove = rowOfPosition - 1, columnInMove = columnOfPosition + 1;
             rowInMove > -1 && columnInMove < BOARDLENGTH;
             rowInMove--, columnInMove++) {

            if (!addBishopMoveForDirection(board, legalMoves, columnInMove, rowInMove)) break;
        }


        for (int rowInMove = rowOfPosition - 1, columnInMove = columnOfPosition - 1;
             rowInMove > -1 && columnInMove > -1;
             rowInMove--, columnInMove--) {

            if (!addBishopMoveForDirection(board, legalMoves, columnInMove, rowInMove)) break;
        }

        for (int rowInMove = rowOfPosition + 1, columnInMove = columnOfPosition - 1;
             rowInMove < BOARDLENGTH && columnInMove > -1;
             rowInMove++, columnInMove--) {

            if (!addBishopMoveForDirection(board, legalMoves, columnInMove, rowInMove)) break;
        }

        return legalMoves;
    }
    private boolean addBishopMoveForDirection(Board board, List<Move> legalMoves, int columnInMove, int rowInMove) {
        Field destinationField = board.getField(columnInMove, rowInMove);
        if (destinationField.getIsOccupiedBy()==null) {
            legalMoves.add(new NonCapturingMove(board, this, destinationField));
        } else {
            Piece pieceAtDestination = destinationField.getIsOccupiedBy();
            Alliance pieceAtDestinationAlliance = pieceAtDestination.getAlliance();
            if(this.getAlliance()!=pieceAtDestinationAlliance){
                legalMoves.add(new CapturingMove(board, this, destinationField, pieceAtDestination));
            }
            return false;
        }
        return true;
    }
}
