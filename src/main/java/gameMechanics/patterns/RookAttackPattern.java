package gameMechanics.patterns;

import gameMechanics.Alliance;
import gameMechanics.Position;
import gameMechanics.utils.PositionTranslator;

public class RookAttackPattern extends AttackPatternBase implements AttackPattern {

    public void setAttackPatternForPosition(Position position, Alliance alliance) {

        PositionTranslator translator = new PositionTranslator(position,null, null,null);
        int columnOfPosition = translator.getColumn();
        int rowOfPosition = translator.getRow();

        for (int i = 0; i < 8; i++) {
            if (i != rowOfPosition) {
                grid[columnOfPosition][i] = alliance.indicator;
            }
            if (i != columnOfPosition) {
                grid[i][rowOfPosition] = alliance.indicator;
            }
        }
    }

    @Override
    public int[][] getAttackPattern(Position position, Alliance alliance) {
        setAttackPatternForPosition(position,alliance);
        return this.grid;
    }
}
