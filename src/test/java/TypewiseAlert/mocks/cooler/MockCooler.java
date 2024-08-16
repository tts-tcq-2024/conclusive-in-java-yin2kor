package TypewiseAlert.mocks.cooler;

import TypewiseAlert.cooler.CoolerBase;

public class MockCooler extends CoolerBase {
    public MockCooler(int lower, int upper) {
        mLowerLimit = lower;
        mUpperLimit = upper;
    }
}
