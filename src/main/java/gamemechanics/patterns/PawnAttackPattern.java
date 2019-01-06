package gamemechanics.patterns;

import gamemechanics.Alliance;
import gamemechanics.Position;
import gamemechanics.utils.PositionTranslator;

public class PawnAttackPattern extends AttackPatternBase implements AttackPattern {

    @Override
    public void setAttackPatternForPosition(Position position, Alliance alliance) {

        PositionTranslator translator = new PositionTranslator(position,null, null,null);
        int columnOfPosition = translator.getColumn();
        int rowOfPosition = translator.getRow();

        int indicator = alliance.indicator;

        if (alliance == Alliance.WHITE) {
            if (rowOfPosition != 7 && columnOfPosition != 0) {
                grid[columnOfPosition - 1][rowOfPosition + indicator] = indicator;
            }
            if (rowOfPosition != 7 && columnOfPosition != 7) {
                grid[columnOfPosition + 1][rowOfPosition + indicator] = indicator;
            }
        }

		if (alliance == Alliance.BLACK) {
            if (rowOfPosition != 0 && columnOfPosition != 0) {
                grid[columnOfPosition - 1][rowOfPosition + indicator] = indicator;
            }
            if (rowOfPosition != 0 && columnOfPosition != 7) {
                grid[columnOfPosition + 1][rowOfPosition + indicator] = indicator;
            }
        }
    }

    @Override
    public int[][] getAttackPattern(Position position, Alliance alliance) {
        setAttackPatternForPosition(position,alliance);
        return this.grid;
    }
}

