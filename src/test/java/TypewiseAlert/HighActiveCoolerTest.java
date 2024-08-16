package TypewiseAlert;

import TypewiseAlert.cooler.HighActiveCooler;
import org.junit.Test;

public class HighActiveCoolerTest {
    @Test
    public void testCheckLimits() {
        HighActiveCooler highActiveCooler = new HighActiveCooler();
        assert highActiveCooler.getUpperLimit() != highActiveCooler.getLowerLimit();
        assert highActiveCooler.getUpperLimit() > highActiveCooler.getLowerLimit();
    }
}
