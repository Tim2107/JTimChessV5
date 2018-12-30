package gameMechanics.patterns;

import gameMechanics.Alliance;
import gameMechanics.Position;

public class QueenAttackPattern extends AttackPatternBase implements AttackPattern {

   BishopAttackPattern bishopPartQueenPattern = new BishopAttackPattern();
   RookAttackPattern rookPartQueenPattern = new RookAttackPattern();

    @Override
    public void setAttackPatternForPosition(Position position, Alliance alliance) {
        composeQueenPattern(bishopPartQueenPattern.getAttackPattern(position, alliance));
        composeQueenPattern(rookPartQueenPattern.getAttackPattern(position,alliance));
        }

    @Override
    public int[][] getAttackPattern(Position position, Alliance alliance) {
        setAttackPatternForPosition(position,alliance);
        return this.grid;
    }

    private void composeQueenPattern(int[][] queenPatternPart){
        for (int row = 7; row > -1; row--) {
            for (int column = 0; column < 8; column++) {
                if(queenPatternPart[column][row] != 0)
                this.grid[column][row]=queenPatternPart[column][row];
                }
        }
    }
}
