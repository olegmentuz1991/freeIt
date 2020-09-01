package lesson7.maintask.abstractClasses;

public class Automobiles extends LandTransport {
    private String bodyType;
    private int maxPassengers;

    public Automobiles(double power, double maxSpeed, double mass, String brand, int wheels, double fuelConsumption, String bodyType, int maxPassengers) {
        super(power, maxSpeed, mass, brand, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "Automobiles{" +
                "bodyType='" + bodyType + '\'' +
                ", maxPassengers=" + maxPassengers +
                ", " + super.toString();
    }
}
