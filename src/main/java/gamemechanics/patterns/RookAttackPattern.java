package gamemechanics.patterns;

import gamemechanics.Alliance;
import gamemechanics.Position;
import gamemechanics.utils.PositionTranslator;

public class RookAttackPattern extends AttackPatternBase implements AttackPattern {

    public void setAttackPatternForPosition(Position position, Alliance alliance) {

        PositionTranslator translator = new PositionTranslator(position,null, null,null);
        int columnOfPosition = translator.getColumn();
        int rowOfPosition = translator.getRow();

        for (int fieldsToMark = 0; fieldsToMark < 8; fieldsToMark++) {
            if (fieldsToMark != rowOfPosition) {
                grid[columnOfPosition][fieldsToMark] = alliance.indicator;
            }
            if (fieldsToMark != columnOfPosition) {
                grid[fieldsToMark][rowOfPosition] = alliance.indicator;
            }
        }
    }

    @Override
    public int[][] getAttackPattern(Position position, Alliance alliance) {
        setAttackPatternForPosition(position,alliance);
        return this.grid;
    }
}
