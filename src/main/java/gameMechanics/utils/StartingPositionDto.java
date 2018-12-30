package gameMechanics.utils;

import gameMechanics.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

import static gameMechanics.Alliance.*;
import static gameMechanics.Position.*;
import static gameMechanics.Type.*;

public class StartingPositionDto {

   private List<Piece> initialPiecePlacement = new ArrayList<>();

   private final Piece whiteKing = new Piece(KING, WHITE, D1);
   private final Piece blackKing = new Piece(KING, BLACK, D8);
   private final Piece whiteQueen = new Piece(QUEEN, WHITE, E1);
   private final Piece blackQueen = new Piece(QUEEN, BLACK, E8);
   private final Piece whiteRook1 = new Piece(ROOK, WHITE, A1);
   private final Piece whiteRook2 = new Piece(ROOK, WHITE, H1);
   private final Piece blackRook1 = new Piece(ROOK, BLACK, A8);
   private final Piece blackRook2 = new Piece(ROOK, BLACK, H8);
   private final Piece whiteKnight1 = new Piece(KNIGHT, WHITE, B1);
   private final Piece whiteKnight2 = new Piece(KNIGHT, WHITE, G1);
   private final Piece blackKnight1 = new Piece(KNIGHT, BLACK, B8);
   private final Piece blackKnight2 = new Piece(KNIGHT, BLACK, G8);
   private final Piece whiteBishop1 = new Piece(BISHOP, WHITE, C1);
   private final Piece whiteBishop2 = new Piece(BISHOP, WHITE, F1);
   private final Piece blackBishop1 = new Piece(BISHOP,BLACK,C8);
   private final Piece blackBishop2 = new Piece(BISHOP,BLACK,F8);
   private final Piece whitePawn1 = new Piece(PAWN,WHITE,A2 );
   private final Piece whitePawn2 = new Piece(PAWN,WHITE,B2);
   private final Piece whitePawn3 = new Piece(PAWN,WHITE,C2);
   private final Piece whitePawn4 = new Piece(PAWN,WHITE,D2);
   private final Piece whitePawn5 = new Piece(PAWN,WHITE,E2);
   private final Piece whitePawn6 = new Piece(PAWN,WHITE,F2);
   private final Piece whitePawn7 = new Piece(PAWN,WHITE,G2);
   private final Piece whitePawn8 = new Piece(PAWN,WHITE,H2);
   private final Piece blackPawn1 = new Piece(PAWN,BLACK,A7);
   private final Piece blackPawn2 = new Piece(PAWN,BLACK,B7);
   private final Piece blackPawn3 = new Piece(PAWN,BLACK,C7);
   private final Piece blackPawn4 = new Piece(PAWN,BLACK,D7);
   private final Piece blackPawn5 = new Piece(PAWN,BLACK,E7);
   private final Piece blackPawn6 = new Piece(PAWN,BLACK,F7);
   private final Piece blackPawn7 = new Piece(PAWN,BLACK,G7);
   private final Piece blackPawn8 = new Piece(PAWN,BLACK,H7);

   public StartingPositionDto(){
       initialPiecePlacement.add(whiteKing);
       initialPiecePlacement.add(blackKing);
       initialPiecePlacement.add(whiteQueen);
       initialPiecePlacement.add(blackQueen);
       initialPiecePlacement.add(whiteRook1);
       initialPiecePlacement.add(whiteRook2);
       initialPiecePlacement.add(whiteKnight1);
       initialPiecePlacement.add(whiteKnight2);
       initialPiecePlacement.add(whiteBishop1);
       initialPiecePlacement.add(whiteBishop2);
       initialPiecePlacement.add(blackRook1);
       initialPiecePlacement.add(blackRook2);
       initialPiecePlacement.add(blackKnight1);
       initialPiecePlacement.add(blackKnight2);
       initialPiecePlacement.add(blackBishop1);
       initialPiecePlacement.add(blackBishop2);
       initialPiecePlacement.add(whitePawn1);
       initialPiecePlacement.add(whitePawn2);
       initialPiecePlacement.add(whitePawn3);
       initialPiecePlacement.add(whitePawn4);
       initialPiecePlacement.add(whitePawn5);
       initialPiecePlacement.add(whitePawn6);
       initialPiecePlacement.add(whitePawn7);
       initialPiecePlacement.add(whitePawn8);
       initialPiecePlacement.add(blackPawn1);
       initialPiecePlacement.add(blackPawn2);
       initialPiecePlacement.add(blackPawn3);
       initialPiecePlacement.add(blackPawn4);
       initialPiecePlacement.add(blackPawn5);
       initialPiecePlacement.add(blackPawn6);
       initialPiecePlacement.add(blackPawn7);
       initialPiecePlacement.add(blackPawn8);
   }

    public List<Piece> getInitialPiecePlacement() {
        return initialPiecePlacement;
    }
}
