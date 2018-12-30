package gameMechanics.patterns;

public class AttackPatternFactory {

        public AttackPattern instantiateChessPattern(String patternType){
            if (patternType==null){
                return null;
            }

            else if (patternType.equalsIgnoreCase("king")){
                return new KingAttackPattern();
            }

            else if (patternType.equalsIgnoreCase("queen")){
                return new QueenAttackPattern();
            }
            else if (patternType.equalsIgnoreCase("rook")){
                return new RookAttackPattern();
            }
            else if (patternType.equalsIgnoreCase("knight")){
                return new KnightAttakPattern();
            }
            else if (patternType.equalsIgnoreCase("bishop")){
                return new BishopAttackPattern();
            }

            else if (patternType.equalsIgnoreCase("pawn")){
                return new PawnAttackPattern();
            }

            return null;
        }
}
