package Task26;

public class Fridge extends ElectricalDevice {
    private int minTemepature;
    private String energyClass;

    public Fridge(String brand, int warranty, int voltage, boolean isOn, int minTemepature, String energyClass) {
        super(brand, warranty, voltage, isOn);
        this.minTemepature = minTemepature;
        this.energyClass = energyClass;
    }
}
