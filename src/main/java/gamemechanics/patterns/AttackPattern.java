package gamemechanics.patterns;

import gamemechanics.Alliance;
import gamemechanics.Position;

public interface AttackPattern {

   void setAttackPatternForPosition(Position position, Alliance alliance);
   int [][] getAttackPattern(Position position, Alliance alliance);
}
