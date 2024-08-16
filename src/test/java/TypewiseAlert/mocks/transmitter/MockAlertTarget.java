package TypewiseAlert.mocks.transmitter;

import TypewiseAlert.BreachType;
import TypewiseAlert.transmitter.IAlertTarget;

public class MockAlertTarget implements IAlertTarget {
    public BreachType mBreachType = null;

    @Override
    public void SendAlertInfo(BreachType breachType) {
            mBreachType = breachType;
    }
}
