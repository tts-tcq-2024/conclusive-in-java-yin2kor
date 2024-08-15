package TypewiseAlert.transmitter;

import TypewiseAlert.BreachType;

public interface IAlertTarget {
    void SendAlertInfo(BreachType breachType);
}
