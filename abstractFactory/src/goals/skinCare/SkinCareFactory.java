package goals.skinCare;

import app.GoalFactory;
import app.PlanFactory;
import plans.MealPlan;
import plans.WorkoutPlan;

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
