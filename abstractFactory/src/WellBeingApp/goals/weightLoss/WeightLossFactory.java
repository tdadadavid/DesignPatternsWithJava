package WellBeingApp.goals.weightLoss;

import WellBeingApp.core.GoalFactory;
import WellBeingApp.plans.MealPlan;
import WellBeingApp.plans.WorkoutPlan;

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
