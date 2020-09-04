package Task26;

public class Teapot extends ElectricalDevice {
    private double volume;
    private boolean autoSwitchOff;

    public Teapot(String brand, int warranty, int voltage, boolean isOn, double volume, boolean autoSwitchOff) {
        super(brand, warranty, voltage, isOn);
        this.volume = volume;
        this.autoSwitchOff = autoSwitchOff;
    }
}
