package TypewiseAlert;

import TypewiseAlert.cooler.ICooler;
import TypewiseAlert.transmitter.Email;
import TypewiseAlert.transmitter.IAlertTarget;

public class TypewiseAlert {
    private static final IAlertTarget mEmail = new Email("a.b@c.com");

    public static BreachType inferBreach(double value, double lowerLimit, double upperLimit) {
        if (value < lowerLimit) {
            return BreachType.TOO_LOW;
        }
        if (value > upperLimit) {
            return BreachType.TOO_HIGH;
        }
        return BreachType.NORMAL;
    }

    public static BreachType classifyTemperatureBreach(
            ICooler cooler, double temperatureInC) {
        return inferBreach(temperatureInC, cooler.getLowerLimit(), cooler.getUpperLimit());
    }


    public static void checkAndAlert(
            IAlertTarget alertTarget, BatteryCharacter batteryChar, double temperatureInC) {

        BreachType breachType = classifyTemperatureBreach(
                batteryChar.getCooler(), temperatureInC
        );

        if (breachType != BreachType.NORMAL) {
            alertTarget.SendAlertInfo(breachType);
        }

    }

}
