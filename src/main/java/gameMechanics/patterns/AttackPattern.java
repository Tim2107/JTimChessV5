package gameMechanics.patterns;

import gameMechanics.Alliance;
import gameMechanics.Position;

public interface AttackPattern {

   void setAttackPatternForPosition(Position position, Alliance alliance);
   int [][] getAttackPattern(Position position, Alliance alliance);
}
