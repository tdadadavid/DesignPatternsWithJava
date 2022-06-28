package DuplicatingComponents.BetterApproach.PoorApproach;

public class Rectangle implements Component{
    private int length;
    private int breadth;

    @Override
    public void render() {
        System.out.println("Rendering a rectangle");
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
