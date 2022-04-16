package goals.weightLoss;

import app.GoalFactory;
import plans.MealPlan;
import plans.WorkoutPlan;

public class WeightLossFactory implements GoalFactory {
    @Override
    public MealPlan createMealPlan() {
        return new WeighLossMealPlan();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WeightLossWorkout();
    }
}
