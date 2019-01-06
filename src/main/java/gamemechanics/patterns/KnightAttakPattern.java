package gamemechanics.patterns;

import gamemechanics.Alliance;
import gamemechanics.Position;
import gamemechanics.utils.PositionTranslator;

public class KnightAttakPattern extends AttackPatternBase implements AttackPattern {

    @Override
    public void setAttackPatternForPosition(Position position, Alliance alliance) {

        PositionTranslator translator = new PositionTranslator(position,null, null,null);
        int columnOfPosition = translator.getColumn();
        int rowOfPosition = translator.getRow();

        if (columnOfPosition - 2 > -1 && rowOfPosition - 1 > -1) {
            grid[columnOfPosition - 2][rowOfPosition - 1] = alliance.indicator;
        }
        if (columnOfPosition - 2 > -1 && rowOfPosition + 1 < 8) {
            grid[columnOfPosition - 2][rowOfPosition + 1] = alliance.indicator;
        }
        if (columnOfPosition + 2 < 8 && rowOfPosition - 1 > -1) {
            grid[columnOfPosition + 2][rowOfPosition - 1] = alliance.indicator;
        }
        if (columnOfPosition + 2 < 8 && rowOfPosition + 1 < 8) {
            grid[columnOfPosition + 2][rowOfPosition + 1] = alliance.indicator;
        }
        if (columnOfPosition - 1 > -1 && rowOfPosition - 2 > -1) {
            grid[columnOfPosition - 1][rowOfPosition - 2] = alliance.indicator;
        }
        if (columnOfPosition - 1 > -1 && rowOfPosition + 2 < 8) {
            grid[columnOfPosition - 1][rowOfPosition + 2] = alliance.indicator;
        }
        if (columnOfPosition + 1 < 8 && rowOfPosition - 2 > -1) {
            grid[columnOfPosition + 1][rowOfPosition - 2] = alliance.indicator;
        }
        if (columnOfPosition + 1 < 8 && rowOfPosition + 2 < 8) {
            grid[columnOfPosition + 1][rowOfPosition + 2] = alliance.indicator;
        }
    }

    @Override
    public int[][] getAttackPattern(Position position, Alliance alliance) {
        setAttackPatternForPosition(position,alliance);
        return this.grid;
    }
}
