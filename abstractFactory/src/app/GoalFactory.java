package app;

import plans.MealPlan;
import plans.WorkoutPlan;

public interface GoalFactory {
    MealPlan createMealPlan();
    WorkoutPlan createWorkoutPlan();
}
