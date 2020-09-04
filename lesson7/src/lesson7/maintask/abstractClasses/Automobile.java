package lesson7.maintask.abstractClasses;

public class Automobile extends LandTransport {
    private String bodyType;
    private int maxPassengers;

    public Automobile(double power, double maxSpeed, double mass, String brand, int wheels, double fuelConsumption, String bodyType, int maxPassengers) {
        super(power, maxSpeed, mass, brand, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.maxPassengers = maxPassengers;
    }

    public double calculatePower(Automobile automobile) {
        double power = automobile.getPower() * 0.74;
        return power;
    }

    private double calculateFuelConsumption(double hours) {
         double result = this.getMaxSpeed() * hours / 100 * this.getFuelConsumption();
         return result;
    }
    public void showFuelConsumption(double hours) {
        System.out.println("За время " + hours + " часа, " + "автомобиль " + this.getBrand() +
                " двигаясь с максимальной скоростью " + this.getMaxSpeed() + " израсходует " + calculateFuelConsumption(hours) + " литров топлива.");
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "bodyType='" + bodyType + '\'' +
                ", maxPassengers=" + maxPassengers +
                ", " + super.toString() + "Мощность в Л.С. = " + calculatePower(this);
    }
}
