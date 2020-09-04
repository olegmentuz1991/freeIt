package Task26;

public abstract class ElectricalDevice extends HouseholdAppliance {
    private int voltage;
    private boolean isOn;

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public ElectricalDevice(String brand, int warranty, int voltage, boolean isOn) {
        super(brand, warranty);
        this.voltage = voltage;
        this.isOn = isOn;
    }
}
