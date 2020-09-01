package Task26;

public class OtherDevice extends HouseholdAppliance {
    public OtherDevice(String name, int warranty) {
        super(name, warranty);
    }

    private enum type{
        BATTERY, GAS, MANUAL
    }
}
