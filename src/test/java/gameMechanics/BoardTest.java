package gameMechanics;

import gameMechanics.pieces.Piece;
import gameMechanics.utils.StartingPositionDto;
import org.junit.jupiter.api.Test;

import java.util.List;

class BoardTest {

    @Test
    void getField() {
    }

    @Test
    void getField1() {
    }

    @Test
    void getField2() {
    }

    @Test
    void putPieceOnField() {
    }

    @Test
    void removePieceFromField() {
    }

    @Test
    void setBoard() {
        StartingPositionDto startingPosition = new StartingPositionDto();
        List<Piece> startingPositions = startingPosition.getInitialPiecePlacement();
        Board testBoard = new Board(startingPositions);
        List<Piece> activePieces = testBoard.getActivePieces();
        activePieces.forEach(piece -> System.out.println(piece.getAlliance() + " " +piece.getType() +" "+piece.getPosition()));
    }

    @Test
    void updateActivePieces() {
        StartingPositionDto startingPosition = new StartingPositionDto();
        List<Piece> startingPositions = startingPosition.getInitialPiecePlacement();
        Board testBoard = new Board(startingPositions);
        List<Piece> activePieces = testBoard.getActivePieces();
        List<Piece> activeWhitePieces = testBoard.getActiveWhitePieces();
        List<Piece> activeBlackPieces = testBoard.getActiveBlackPieces();

        activePieces.forEach(piece -> System.out.println(piece.getAlliance() + " " + piece.getType() +" "+piece.getPosition()));
        System.out.println();
        activeWhitePieces.forEach(piece -> System.out.println(piece.getAlliance() + " " +piece.getType() +" "+piece.getPosition()));
        System.out.println();
        activeBlackPieces.forEach(piece -> System.out.println(piece.getAlliance() + " " +piece.getType() +" "+piece.getPosition()));
    }

    @Test
    void getBenchedPieces() {
    }

    @Test
    void setBenchedPieces() {
    }

    @Test
    void addBenchedPiece() {
    }
}