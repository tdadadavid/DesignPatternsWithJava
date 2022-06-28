package Solution;

public class Clip implements Component {
    private int timeLapse;

    Clip(int timelapse){
        this.timeLapse = timelapse;
    }

    public int getTimeLapse(){
        return this.timeLapse;
    }

    @Override
    public Clip clone() {
        return new Clip(this.getTimeLapse());
    }
}
