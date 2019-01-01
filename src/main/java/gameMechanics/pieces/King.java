package gameMechanics.pieces;

import gameMechanics.*;
import gameMechanics.moves.CapturingMove;
import gameMechanics.moves.Move;
import gameMechanics.moves.NonCapturingMove;
import gameMechanics.utils.PositionTranslator;

import java.util.ArrayList;
import java.util.List;

import static gameMechanics.Type.KING;

public class King extends Piece {

    public King(Alliance alliance, Position position){
        super(KING, alliance, position);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {

        List<Move> legalMoves = new ArrayList<>();

        PositionTranslator translator = new PositionTranslator(position,null, null,null);
        int columnOfPosition = translator.getColumn();
        int rowOfPosition = translator.getRow();

        if (columnOfPosition != 0 && rowOfPosition != 0) {
            addKingMove(board,legalMoves,columnOfPosition-1,rowOfPosition-1);
            }

        if (columnOfPosition != 0 && rowOfPosition != 7) {
            addKingMove(board,legalMoves,columnOfPosition-1,rowOfPosition+1);
        }

        if (columnOfPosition != 7 && rowOfPosition != 0) {
            addKingMove(board,legalMoves,columnOfPosition+1,rowOfPosition-1);
        }

        if (columnOfPosition != 7 && rowOfPosition != 7) {
            addKingMove(board,legalMoves,columnOfPosition+1,rowOfPosition+1);
        }

        if (columnOfPosition != 0) {
            addKingMove(board,legalMoves,columnOfPosition-1,rowOfPosition);
        }

        if (columnOfPosition != 7) {
            addKingMove(board,legalMoves,columnOfPosition+1,rowOfPosition);
        }

        if (rowOfPosition != 0) {
            addKingMove(board,legalMoves,columnOfPosition,rowOfPosition-1);
            }

        if (rowOfPosition != 7) {
            addKingMove(board,legalMoves,columnOfPosition,rowOfPosition+1);
        }
        return legalMoves;
    }

    private boolean addKingMove(Board board, List<Move> legalMoves, int columnInMove, int rowInMove) {
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
