package lesson7.maintask.abstractClasses;

public abstract class LandTransport extends Transport {
    private int wheels;
    private double fuelConsumption;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return  "wheels=" + wheels +
                ", fuelConsumption=" + fuelConsumption +
                ", " + super.toString();
    }

    public LandTransport(double power, double maxSpeed, double mass, String brand, int wheels, double fuelConsumption) {
        super(power, maxSpeed, mass, brand);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }
}
