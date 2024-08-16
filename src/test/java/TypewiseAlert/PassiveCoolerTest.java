package TypewiseAlert;

import TypewiseAlert.cooler.PassiveCooler;
import org.junit.Test;

public class PassiveCoolerTest {

    @Test
    public void testCheckLimits() {
        PassiveCooler passiveCooler = new PassiveCooler();
        assert passiveCooler.getUpperLimit() != passiveCooler.getLowerLimit();
        assert passiveCooler.getUpperLimit() > passiveCooler.getLowerLimit();
    }
}
