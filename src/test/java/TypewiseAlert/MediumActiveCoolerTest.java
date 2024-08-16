package TypewiseAlert;

import TypewiseAlert.cooler.MediumActiveCooler;
import TypewiseAlert.cooler.PassiveCooler;
import org.junit.Test;

public class MediumActiveCoolerTest {
    @Test
    public void testCheckLimits() {
        MediumActiveCooler mediumActiveCooler = new MediumActiveCooler();
        assert mediumActiveCooler.getUpperLimit() != mediumActiveCooler.getLowerLimit();
        assert mediumActiveCooler.getUpperLimit() > mediumActiveCooler.getLowerLimit();
    }
}
