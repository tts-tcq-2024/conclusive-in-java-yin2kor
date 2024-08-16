package TypewiseAlert.transmitter;

import TypewiseAlert.BreachType;

public class Controller implements IAlertTarget {
    private int mHeader = 0xfeed;
    @Override
    public void SendAlertInfo(BreachType breachType) {
        System.out.printf("%d : temperature %s\n", mHeader, breachType.getMessage());
    }
}
