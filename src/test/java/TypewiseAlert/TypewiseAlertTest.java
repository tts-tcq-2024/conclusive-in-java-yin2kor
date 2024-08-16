package TypewiseAlert;

import TypewiseAlert.cooler.ICooler;
import TypewiseAlert.mocks.cooler.MockCooler;
import TypewiseAlert.mocks.transmitter.MockAlertTarget;
import TypewiseAlert.transmitter.IAlertTarget;

public class TypewiseAlertTest {

    public static void executeTemperatureCheck(int temperature, IAlertTarget alertTarget, ICooler cooler) {
        BatteryCharacter batteryCharacter = new BatteryCharacter(cooler, "Test1");
        TypewiseAlert.checkAndAlert(alertTarget, batteryCharacter, temperature);
    }

    public static void runAllTests() {
        MockAlertTarget mockController = new MockAlertTarget();
        ICooler mockCooler = new MockCooler(0, 35);
        // passive cooler and normal temp
        executeTemperatureCheck(12, mockController, mockCooler);
        assert mockController.mBreachType == null;
        // passive cooler and normal temp
        executeTemperatureCheck(36, mockController, mockCooler);
        assert mockController.mBreachType == BreachType.TOO_HIGH;
        // passive cooler and low temp
        executeTemperatureCheck(-1, mockController, mockCooler);
        assert mockController.mBreachType == BreachType.TOO_LOW;
    }

}
