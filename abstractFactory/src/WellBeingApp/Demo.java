package WellBeingApp;

import WellBeingApp.app.HomePage;
import WellBeingApp.goals.muscleBuilding.MuscleBuildingFactory;
import WellBeingApp.goals.weightLoss.WeightLossFactory;

public class Demo {
    public static void main(String[] args) {
        var homePage = new HomePage();
        homePage.setGoal(new MuscleBuildingFactory());
    }
}
