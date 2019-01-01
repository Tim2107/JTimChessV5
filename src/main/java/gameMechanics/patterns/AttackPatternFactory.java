package gameMechanics.patterns;

import gameMechanics.Type;

import static gameMechanics.Type.*;

public class AttackPatternFactory {

        public AttackPattern instantiateChessPattern(Type type){

            if (type == null){
                return null;
            }

            else if (type.equals(KING)){
                return new KingAttackPattern();
            }

            else if (type.equals(QUEEN)){
                return new QueenAttackPattern();
            }
            else if (type.equals(ROOK)){
                return new RookAttackPattern();
            }
            else if (type.equals(KNIGHT)){
                return new KnightAttakPattern();
            }
            else if (type.equals(BISHOP)){
                return new BishopAttackPattern();
            }

            else if (type.equals(PAWN)){
                return new PawnAttackPattern();
            }

            return null;
        }
}
