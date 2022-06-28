package DuplicatingComponents.BetterApproach;

/**
 * This class in Design pattern is called ConcretePrototype
 */

public class Rectangle implements Component {
    private int length;
    private int breadth;

    @Override
    public void render() {
        System.out.println("Rendering a rectangle");
    }

    @Override
    public Rectangle clone()  {
        return new Rectangle()
                .setBreadth(this.getBreadth())
                .setLength(this.getLength());
    }

    public Rectangle setBreadth(int breadth) {
        this.breadth = breadth;
        return this;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    public Rectangle setLength(int length) {
        this.length = length;
        return  this;
    }
}
