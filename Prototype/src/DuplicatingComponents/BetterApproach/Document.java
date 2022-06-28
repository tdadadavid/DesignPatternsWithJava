package DuplicatingComponents.BetterApproach;

/**
 * Simulating  a Power-point document on Windows
 * or a Keynote in Mac
 */

public class Document {

    public static void main(String[] args) {
        ContextMenu menu = new ContextMenu();

        Circle circle = new Circle();
        circle.setRadius(12);

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setBreadth(8);

        Image image = new Image();
        image.setHeight(100);
        image.setBreadth(7);
        image.setPixelRatio(2);

        System.out.println(menu.duplicate(circle));
        System.out.println(menu.duplicate(rectangle));
        System.out.println(menu.duplicate(image));
    }
}
