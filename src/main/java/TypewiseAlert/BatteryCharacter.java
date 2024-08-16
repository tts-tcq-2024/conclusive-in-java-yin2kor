package TypewiseAlert;

import TypewiseAlert.cooler.ICooler;

public class BatteryCharacter {
    private final ICooler mCooler;
    private final String mBrand;

    public String getBrand() {
        return mBrand;
    }

    public ICooler getCooler() {
        return mCooler;
    }

    public BatteryCharacter(ICooler cooler, String brand) {
        mCooler = cooler;
        mBrand = brand;
    }
}
