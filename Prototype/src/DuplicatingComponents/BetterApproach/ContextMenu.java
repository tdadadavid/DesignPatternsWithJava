package DuplicatingComponents.BetterApproach;

/**
 * Context menu class is the pop screen that comes up
 * when you right-click on a power-point(Windows) Key-note(Mac)
 * file to duplicate or perform other operations
 */

public class ContextMenu {

    /**
     * This approach is incredibly better since we have
     * made this ContextMenu class close for modification
     * and open for extension, any type of component can be
     * duplicated without this class knowing what type it is
     *
     * We have given the responsibility of duplicating (though called clone)
     * to every type of Component, be it a Rectangle, Circle, image or anything
     * once it is a component then it can be cloned.
     *
     * This class in design pattern is known as the Client.
     *
     */
    public Component duplicate(Component component){
        return component.clone();
    }

}
