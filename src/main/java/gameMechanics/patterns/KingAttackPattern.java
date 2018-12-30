package gameMechanics.patterns;

import gameMechanics.Alliance;
import gameMechanics.Position;
import gameMechanics.utils.PositionTranslator;

public class KingAttackPattern extends AttackPatternBase implements AttackPattern {

    @Override
    public void setAttackPatternForPosition(Position position, Alliance alliance) {

        PositionTranslator translator = new PositionTranslator(position,null, null,null);
        int columnInPosition = translator.getColumn();
        int rowInPosition = translator.getRow();

        if (columnInPosition != 0 && rowInPosition != 0) {
            grid[columnInPosition - 1][rowInPosition - 1] = alliance.indicator;
        }
        if (columnInPosition != 0 && rowInPosition != 7) {
            grid[columnInPosition - 1][rowInPosition + 1] = alliance.indicator;
        }

        if (columnInPosition != 7 && rowInPosition != 0) {
            grid[columnInPosition + 1][rowInPosition - 1] = alliance.indicator;
        }
        if (columnInPosition != 7 && rowInPosition != 7) {
            grid[columnInPosition + 1][rowInPosition + 1] = alliance.indicator;
        }

        if (columnInPosition != 0) {
            grid[columnInPosition - 1][rowInPosition] = alliance.indicator;
        }

        if (columnInPosition != 7) {
            grid[columnInPosition + 1][rowInPosition] = alliance.indicator;
        }

        if (rowInPosition != 0) {
            grid[columnInPosition][rowInPosition - 1] = alliance.indicator;
        }

        if (rowInPosition != 7) {
            grid[columnInPosition][rowInPosition + 1] = alliance.indicator;
        }
    }

    @Override
    public int[][] getAttackPattern(Position position, Alliance alliance) {
        setAttackPatternForPosition(position,alliance);
        return this.grid;
    }
}
