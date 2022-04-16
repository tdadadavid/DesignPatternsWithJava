package app;

import plans.MealPlan;
import plans.WorkoutPlan;

public class HomePage {

    public void setGoal(GoalFactory factory) {

        WorkoutPlan workoutPlan = factory.createWorkoutPlan();
        MealPlan mealPlan = factory.createMealPlan();

        System.out.println(workoutPlan);
        System.out.println(mealPlan);

    }
}
