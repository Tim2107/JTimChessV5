package gamemechanics.pieces;

import gamemechanics.*;
import gamemechanics.moves.CapturingMove;
import gamemechanics.moves.Move;
import gamemechanics.moves.NonCapturingMove;
import gamemechanics.utils.PositionTranslator;

import java.util.ArrayList;
import java.util.List;

import static gamemechanics.Type.KNIGHT;

public class Knight extends Piece {

    public Knight(Alliance alliance, Position position){
        super(KNIGHT, alliance, position);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {

        List<Move> legalMoves = new ArrayList<>();

        PositionTranslator translator = new PositionTranslator(position,null, null,null);
        int columnOfPosition = translator.getColumn();
        int rowOfPosition = translator.getRow();

        if (columnOfPosition - 2 > -1 && rowOfPosition - 1 > -1) {
            addKnightMove(board,  legalMoves, columnOfPosition-2,rowOfPosition-1);
        }

        if (columnOfPosition - 2 > -1 && rowOfPosition + 1 < 8) {
            addKnightMove(board,  legalMoves, columnOfPosition-2,rowOfPosition+1);
        }

        if (columnOfPosition + 2 < 8 && rowOfPosition - 1 > -1) {
            addKnightMove(board,  legalMoves, columnOfPosition+2,rowOfPosition-1);
        }

        if (columnOfPosition + 2 < 8 && rowOfPosition + 1 < 8) {
            addKnightMove(board,  legalMoves, columnOfPosition+2,rowOfPosition+1);
        }

        if (columnOfPosition - 1 > -1 && rowOfPosition - 2 > -1) {
            addKnightMove(board,  legalMoves, columnOfPosition-1,rowOfPosition-2);
        }

        if (columnOfPosition - 1 > -1 && rowOfPosition + 2 < 8) {
            addKnightMove(board,  legalMoves, columnOfPosition-1,rowOfPosition+2);
        }

        if (columnOfPosition + 1 < 8 && rowOfPosition - 2 > -1) {
            addKnightMove(board,  legalMoves, columnOfPosition+1,rowOfPosition-2);
        }

        if (columnOfPosition + 1 < 8 && rowOfPosition + 2 < 8) {
            addKnightMove(board,  legalMoves, columnOfPosition+1,rowOfPosition+2);
        }
        return legalMoves;
    }

    private boolean addKnightMove(Board board, List<Move> legalMoves, int columnInMove, int rowInMove) {
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