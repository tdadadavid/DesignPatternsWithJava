package WellBeingApp.goals.muscleBuilding;

import WellBeingApp.core.GoalFactory;

import WellBeingApp.plans.MealPlan;
import WellBeingApp.plans.WorkoutPlan;

public class MuscleBuildingFactory implements GoalFactory {
    @Override
    public MealPlan createMealPlan() {
        return new BuildMuscleMealPlan();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new BuildMuscleWorkoutPlan();
    }
}
