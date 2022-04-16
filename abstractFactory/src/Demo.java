import app.HomePage;
import goals.muscleBuilding.MuscleBuildingFactory;
import goals.skinCare.SkinCareFactory;
import goals.weightLoss.WeightLossFactory;

public class Demo {
    public static void main(String[] args) {
        var homePage = new HomePage();
        homePage.setGoal(new WeightLossFactory());
    }
}
