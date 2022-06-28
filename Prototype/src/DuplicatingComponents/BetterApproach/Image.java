package DuplicatingComponents.BetterApproach;

/**
 * This class in design pattern is Concrete Prototype
 */

public class Image implements Component{
    private int height;
    private int breadth;
    private int pixelRatio;

    public Image setHeight(int newHeight){
        this.height = newHeight;
        return this;
    }

    public Image setBreadth(int newBreadth){
        this.height = newBreadth;
        return this;
    }

    public Image setPixelRatio(int newPixelRatio){
        this.height = newPixelRatio;
        return this;
    }


    public int getBreadth() {
        return breadth;
    }

    public int getHeight(){
        return height;
    }

    public int getPixelRatio(){
        return pixelRatio;
    }

    @Override
    public void render() {
        System.out.println("Rendering an image");
    }

    @Override
    public Component clone() {
        return new Image()
                .setHeight(this.getHeight())
                .setBreadth(this.getBreadth())
                .setPixelRatio(this.getPixelRatio());
    }
}
