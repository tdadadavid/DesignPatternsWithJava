package DuplicatingComponents.BetterApproach;

/**
 *
 *
 * This class in Design patter is called ConcretePrototype
 */

public class Circle implements Component {
    private int radius;

    public Circle setRadius(int radius){
        this.radius = radius;
        return this;
    }

    public int getRadius(){
        return radius;
    }

    public void render(){
        System.out.println("Rendering a Circle");
    }

    @Override
    public Component clone() {
        return new Circle().setRadius(this.getRadius());
    }
}
