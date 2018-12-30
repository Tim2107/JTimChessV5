package gameMechanics.patterns;

import gameMechanics.Alliance;
import gameMechanics.Position;
import gameMechanics.utils.PositionTranslator;

public class BishopAttackPattern extends AttackPatternBase implements AttackPattern {

    @Override
    public void setAttackPatternForPosition(Position position, Alliance alliance) {

        PositionTranslator translator = new PositionTranslator(position,null, null,null);
        int columnOfPosition = translator.getColumn();
        int rowOfPosition = translator.getRow();


        for (int  columnInPattern = columnOfPosition + 1, rowInPattern = rowOfPosition + 1; rowInPattern < 8 && columnInPattern < 8; columnInPattern++, rowInPattern++) {
            grid[columnInPattern][rowInPattern] = alliance.indicator;
        }

        for (int rowInPattern = rowOfPosition - 1, columnInPattern = columnOfPosition + 1; rowInPattern > -1 && columnInPattern < 8; rowInPattern--, columnInPattern++) {
            grid[columnInPattern][rowInPattern] = alliance.indicator;
        }


        for (int rowInPattern = rowOfPosition - 1, columnInPattern = columnOfPosition - 1; rowInPattern > -1 && columnInPattern > -1; rowInPattern--, columnInPattern--) {
            grid[columnInPattern][rowInPattern] = alliance.indicator;
        }

        for (int rowInPattern = rowOfPosition + 1, columnInPattern = columnOfPosition - 1; rowInPattern < 8 && columnInPattern > -1; rowInPattern++, columnInPattern--) {
            grid[columnInPattern][rowInPattern] = alliance.indicator;
        }
    }

    @Override
    public int[][] getAttackPattern(Position position, Alliance alliance) {
        setAttackPatternForPosition(position,alliance);
        return this.grid;
    }
}
