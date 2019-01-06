package gamemechanics.patterns;

public abstract class AttackPatternBase {

    int[][]grid = new int[8][8];

    public AttackPatternBase(){

        this.grid = initializeGrid();
    }

    private int[][] initializeGrid() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                grid[i][j] = 0;
            }
        }
        return grid;
    }
}
