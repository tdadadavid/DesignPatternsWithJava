package DuplicatingComponents.BetterApproach;

/**
 * Here we ensured that anyone that uses
 * this contract/interface/plan must provide
 * a way for cloning itself, so every component
 * is charged with the responsibility of cloning itself.
 *
 * Therefore, we can add different types of components dynamically
 * even at runtime. Meaning someone can extend this code by creating
 * a functionality whereby we can duplicate a sound (just for example) as far
 * as that sound is a type of component, then the sound will clone itself
 * and return a new version of itself
 *
 * This Interface in Design pattern is called Prototype
 */

public interface Component {
    void render();
    Component clone();
}
