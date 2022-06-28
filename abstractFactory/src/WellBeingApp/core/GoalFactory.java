package WellBeingApp.core;

import WellBeingApp.plans.MealPlan;
import WellBeingApp.plans.WorkoutPlan;

public interface GoalFactory {
    MealPlan createMealPlan();
    WorkoutPlan createWorkoutPlan();
}
