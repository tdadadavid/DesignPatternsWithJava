package goals.muscleBuilding;

import app.GoalFactory;

import plans.MealPlan;
import plans.WorkoutPlan;

public class MuscleBuildingFactory implements GoalFactory {
    @Override
    public MealPlan createMealPlan() {
        return new BuildMuscleMealPlan();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new BuildMuscleWorkout();
    }
}
