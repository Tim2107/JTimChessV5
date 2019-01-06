package gamemechanics.pieces;

import gamemechanics.*;
import gamemechanics.moves.CapturingMove;
import gamemechanics.moves.Move;
import gamemechanics.moves.NonCapturingMove;
import gamemechanics.utils.PositionTranslator;

import java.util.ArrayList;
import java.util.List;

import static gamemechanics.Type.PAWN;

public class Pawn extends Piece{


    public Pawn (Alliance alliance, Position position){
        super(PAWN, alliance, position);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {

        List<Move> legalMoves = new ArrayList<>();

        PositionTranslator translator = new PositionTranslator(position,null, null,null);
        int columnOfPosition = translator.getColumn();
        int rowOfPosition = translator.getRow();

        int indicator = this.alliance.indicator;

        Field westAttackField = board.getField(columnOfPosition - 1, rowOfPosition + indicator);
        Field eastAttackField = board.getField(columnOfPosition + 1, rowOfPosition + indicator);

        if (this.alliance == Alliance.WHITE) {
            if (rowOfPosition != 7 && rowOfPosition != 1) {
                addNonCapturingPawnMove(board, legalMoves, columnOfPosition, rowOfPosition + indicator);
            }
            if (rowOfPosition == 1) {
                for (int rowInMove = rowOfPosition + indicator;
                     rowInMove < 4;
                     rowInMove++) {

                    if(!addNonCapturingPawnMove(board, legalMoves, columnOfPosition, rowInMove)) break;
                }
            }

            if (rowOfPosition != 7 && columnOfPosition != 0 && westAttackField.getIsOccupiedBy() != null && westAttackField.getIsOccupiedBy().getAlliance() == Alliance.BLACK) {
                addCapturingPawnMove(board, legalMoves, columnOfPosition-1,rowOfPosition + indicator);
            }
            if (rowOfPosition != 7 && columnOfPosition != 7 && eastAttackField.getIsOccupiedBy() != null && eastAttackField.getIsOccupiedBy().getAlliance() == Alliance.BLACK) {
                addCapturingPawnMove(board, legalMoves, columnOfPosition+1,rowOfPosition + indicator);
            }
        }

        if (this.alliance == Alliance.BLACK) {

            if (rowOfPosition != 0 &&  rowOfPosition != 6) {
                addNonCapturingPawnMove(board, legalMoves, columnOfPosition, rowOfPosition + indicator);
            }
            if (rowOfPosition == 6) {
                for (int rowInMove = rowOfPosition + indicator;
                     rowInMove > 3;
                     rowInMove--) {

                    if(!addNonCapturingPawnMove(board, legalMoves, columnOfPosition, rowInMove)) break;
                }
            }

            if (rowOfPosition != 0 && columnOfPosition != 0 && westAttackField.getIsOccupiedBy() != null && westAttackField.getIsOccupiedBy().getAlliance() == Alliance.WHITE) {
                addCapturingPawnMove(board, legalMoves, columnOfPosition-1,rowOfPosition + indicator);
            }
            if (rowOfPosition != 0 && columnOfPosition != 7 && eastAttackField.getIsOccupiedBy() != null && eastAttackField.getIsOccupiedBy().getAlliance() == Alliance.WHITE) {
                addCapturingPawnMove(board, legalMoves, columnOfPosition+1,rowOfPosition + indicator);
            }
        }

        return legalMoves;
    }

    private boolean addNonCapturingPawnMove(Board board, List<Move> legalMoves, int columnInMove, int rowInMove) {
        Field destinationField = board.getField(columnInMove, rowInMove);
        if (destinationField.getIsOccupiedBy()==null) {
            legalMoves.add(new NonCapturingMove(board, this, destinationField));
            return true;
        }
        else {
            return false;
        }
    }

    private void addCapturingPawnMove(Board board, List<Move> legalMoves, int columnInMove, int rowInMove){

            Field destinationField = board.getField(columnInMove, rowInMove);
            Piece pieceAtDestination = destinationField.getIsOccupiedBy();
            legalMoves.add(new CapturingMove(board, this, destinationField, pieceAtDestination));
    }
}
