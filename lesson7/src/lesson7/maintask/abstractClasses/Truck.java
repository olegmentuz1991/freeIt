package lesson7.maintask.abstractClasses;

public class Trucks extends LandTransport {
    private int maxWeightOnBoard;

    public Trucks(double power, double maxSpeed, double mass, String brand, int wheels, double fuelConsumption, int maxWeightOnBoard) {
        super(power, maxSpeed, mass, brand, wheels, fuelConsumption);
        this.maxWeightOnBoard = maxWeightOnBoard;
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "maxWeightOnBoard=" + maxWeightOnBoard +
                ", " + super.toString();
    }
}
