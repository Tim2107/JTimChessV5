package gameMechanics.pieces;

import gameMechanics.*;
import gameMechanics.moves.CapturingMove;
import gameMechanics.moves.Move;
import gameMechanics.moves.NonCapturingMove;
import gameMechanics.utils.PositionTranslator;

import java.util.ArrayList;
import java.util.List;

import static gameMechanics.Board.BOARDLENGTH;
import static gameMechanics.Type.ROOK;

public class Rook extends Piece{

    public Rook(Alliance alliance, Position position){
        super(ROOK, alliance, position);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {

        List<Move> legalMoves = new ArrayList<>();

        PositionTranslator translator = new PositionTranslator(position,null, null,null);
        int columnOfPosition = translator.getColumn();
        int rowOfPosition = translator.getRow();

        for (int columnInMove = columnOfPosition + 1;
             columnInMove < BOARDLENGTH;
             columnInMove++) {

            if (!addRookMoveForDirection(board, legalMoves, columnInMove, rowOfPosition)) break;
        }

        for (int columnInMove = columnOfPosition - 1;
             columnInMove > - 1 ;
             columnInMove--) {

            if (!addRookMoveForDirection(board, legalMoves, columnInMove, rowOfPosition)) break;
        }


        for (int rowInMove = rowOfPosition + 1;
             rowInMove < BOARDLENGTH;
             rowInMove++) {

            if (!addRookMoveForDirection(board, legalMoves, columnOfPosition, rowInMove)) break;
        }

        for (int rowInMove = rowOfPosition - 1;
             rowInMove > - 1;
             rowInMove--) {

            if (!addRookMoveForDirection(board, legalMoves, columnOfPosition, rowInMove)) break;
        }

        return legalMoves;
    }

    private boolean addRookMoveForDirection(Board board, List<Move> legalMoves, int columnInMove, int rowInMove) {
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

