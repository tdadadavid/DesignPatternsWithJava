package WellBeingApp.goals.skinCare;

import WellBeingApp.core.GoalFactory;
import WellBeingApp.plans.MealPlan;
import WellBeingApp.plans.WorkoutPlan;

public class SkinCareFactory implements GoalFactory {
    @Override
    public MealPlan createMealPlan() {
        return new SkinCareMealPlan();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new SkinCareWorkoutPlan();
    }
}
