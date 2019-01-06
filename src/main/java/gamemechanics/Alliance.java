package gamemechanics;

public enum Alliance {

    WHITE(1),
    BLACK(-1);

    public int indicator;

    Alliance(int indicator){
        this.indicator = indicator;
    }
}
