package WellBeingApp.app;

import WellBeingApp.core.GoalFactory;
import WellBeingApp.plans.MealPlan;
import WellBeingApp.plans.WorkoutPlan;

public class HomePage {

    public void setGoal(GoalFactory factory) {

        WorkoutPlan workoutPlan = factory.createWorkoutPlan();
        MealPlan mealPlan = factory.createMealPlan();

        System.out.println(workoutPlan);
        System.out.println(mealPlan);

    }
}
