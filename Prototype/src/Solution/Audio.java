package Solution;

public class Audio implements Component {
    private int duration;

    public int getDuration() {
        return duration;
    }

    public Audio setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public Audio clone() {
        return new Audio()
                .setDuration(this.getDuration());
    }
}
