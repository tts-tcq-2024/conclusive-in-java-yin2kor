package TypewiseAlert.cooler;

public class CoolerBase implements ICooler {
    protected int mLowerLimit = 0;
    protected int mUpperLimit = 0;

    @Override
    public int getUpperLimit() {
        return mUpperLimit;
    }

    @Override
    public int getLowerLimit() {
        return mLowerLimit;
    }
}
