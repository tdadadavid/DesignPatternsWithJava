package DuplicatingComponents.BetterApproach.PoorApproach;

/**
 * Context menu class is the pop screen that comes up
 * when you right-click on a power-point(Windows) Key-note(Mac)
 * file to duplicate or perform other operations
 *
 *
 *
 */

public class ContextMenu {

    /*
     * The First problem with this approach is that
     * this context menu class is filled with too
     * much "not-needed information/knowledge". Take for example
     * we have to duplicate 100 different shapes, lines,
     * images and other stuffs, Are we going to write if
     * statements for all those? of course No!
     *
     * ContextMenu.duplicate() function shouldn't be aware of
     * circle, square and other shapes...
     *
     * Secondly this approach doesn't meet the standard of
     * the Open-closed principle which is "A class should be
     * open for extension but closed for modification" (check the
     * link below) Because if we want to duplicate another shape like
     * rectangle we would have to write another if statement or switch
     * statement which will make this "duplicate function" not closed
     *
     * <link for good understanding of this principle>
     *  https://www.youtube.com/watch?v=-ptMtJAdj40
     *
     * Thirdly this ContextMenu duplicate function must be aware
     * of all types of component before runtime, that means people
     * cannot pick this code and extend it (add new types of component
     * to it)
     */

//    public Component duplicate(Component component){
//
//        if (component instanceof Circle){
//            Circle source = (Circle) component;
//            Circle clone = new Circle();
//            clone.setRadius(source.getRadius());
//        } else if (component instanceof Rectangle) {
//            Rectangle source = (Rectangle) component;
//            Rectangle clone = new Rectangle();
//            clone.setLength(source.getLength());
//            clone.setBreadth(source.getBreadth());
//        }
//
//        // ignore the error...
//    }

}
