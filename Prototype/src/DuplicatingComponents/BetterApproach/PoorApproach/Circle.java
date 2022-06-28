package DuplicatingComponents.BetterApproach.PoorApproach;

public class Circle implements Component {
    private int radius;

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void render(){
        System.out.println("Rendering a Circle");
    }
}
