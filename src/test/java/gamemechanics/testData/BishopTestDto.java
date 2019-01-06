package gamemechanics.testData;

import gamemechanics.pieces.*;

import java.util.ArrayList;
import java.util.List;

import static gamemechanics.Alliance.BLACK;
import static gamemechanics.Alliance.WHITE;
import static gamemechanics.Position.*;
import static gamemechanics.Position.H7;

public class BishopTestDto {

    private List<Piece> initialPiecePlacement = new ArrayList<>();

    private final Piece whiteKing = new King(WHITE, D1);
    private final Piece blackKing = new King(BLACK, D8);
    private final Piece whiteQueen = new Queen(WHITE, E1);
    private final Piece blackQueen = new Queen(BLACK, E8);
    private final Piece whiteRook1 = new Rook(WHITE, A1);
    private final Piece whiteRook2 = new Rook(WHITE, H1);
    private final Piece blackRook1 = new Rook(BLACK, A8);
    private final Piece blackRook2 = new Rook(BLACK, H8);
    private final Piece whiteKnight1 = new Knight(WHITE, B1);
    private final Piece whiteKnight2 = new Knight(WHITE, G1);
    private final Piece blackKnight1 = new Knight(BLACK, B8);
    private final Piece blackKnight2 = new Knight(BLACK, G8);
    private final Piece whiteBishop1 = new Bishop(WHITE, C1);
    private final Piece whiteBishop2 = new Bishop(WHITE, F1);
    private final Piece blackBishop1 = new Bishop(BLACK,F4);
    private final Piece blackBishop2 = new Bishop(BLACK,F8);
    private final Piece whitePawn1 = new Pawn(WHITE,A2 );
    private final Piece whitePawn2 = new Pawn(WHITE,B2);
    private final Piece whitePawn3 = new Pawn(WHITE,C2);
    private final Piece whitePawn4 = new Pawn(WHITE,D2);
    private final Piece whitePawn5 = new Pawn(WHITE,E2);
    private final Piece whitePawn6 = new Pawn(WHITE,F2);
    private final Piece whitePawn7 = new Pawn(WHITE,G2);
    private final Piece whitePawn8 = new Pawn(WHITE,H2);
    private final Piece blackPawn1 = new Pawn(BLACK,A7);
    private final Piece blackPawn2 = new Pawn(BLACK,B7);
    private final Piece blackPawn3 = new Pawn(BLACK,C7);
    private final Piece blackPawn4 = new Pawn(BLACK,D7);
    private final Piece blackPawn5 = new Pawn(BLACK,E7);
    private final Piece blackPawn6 = new Pawn(BLACK,F7);
    private final Piece blackPawn7 = new Pawn(BLACK,G7);
    private final Piece blackPawn8 = new Pawn(BLACK,H7);

    public BishopTestDto(){
       //initialPiecePlacement.add(whiteKing);
       //initialPiecePlacement.add(blackKing);
       //initialPiecePlacement.add(whiteQueen);
       //initialPiecePlacement.add(blackQueen);
       //initialPiecePlacement.add(whiteRook1);
       //initialPiecePlacement.add(whiteRook2);
       //initialPiecePlacement.add(whiteKnight1);
       //initialPiecePlacement.add(whiteKnight2);
        initialPiecePlacement.add(whiteBishop1);
        initialPiecePlacement.add(whiteBishop2);
        //initialPiecePlacement.add(blackRook1);
        //initialPiecePlacement.add(blackRook2);
        //initialPiecePlacement.add(blackKnight1);
        //initialPiecePlacement.add(blackKnight2);
        initialPiecePlacement.add(blackBishop1);
        //initialPiecePlacement.add(blackBishop2);
        //initialPiecePlacement.add(whitePawn1);
        initialPiecePlacement.add(whitePawn2);
        //initialPiecePlacement.add(whitePawn3);
        //initialPiecePlacement.add(whitePawn4);
        //initialPiecePlacement.add(whitePawn5);
        //initialPiecePlacement.add(whitePawn6);
        //initialPiecePlacement.add(whitePawn7);
        //initialPiecePlacement.add(whitePawn8);
        //initialPiecePlacement.add(blackPawn1);
        //initialPiecePlacement.add(blackPawn2);
        //initialPiecePlacement.add(blackPawn3);
        //initialPiecePlacement.add(blackPawn4);
        //initialPiecePlacement.add(blackPawn5);
        //initialPiecePlacement.add(blackPawn6);
        //initialPiecePlacement.add(blackPawn7);
        //initialPiecePlacement.add(blackPawn8);
    }

    public List<Piece> getPiecePlacement() {
        return initialPiecePlacement;
    }
}
