package lesson7.maintask.abstractClasses;

public class Truck extends LandTransport {
    private int maxWeightOnBoard;

    public Truck(double power, double maxSpeed, double mass, String brand, int wheels, double fuelConsumption, int maxWeightOnBoard) {
        super(power, maxSpeed, mass, brand, wheels, fuelConsumption);
        this.maxWeightOnBoard = maxWeightOnBoard;
    }
    public double calculatePower(Truck truck) {
        double power = truck.getPower()*0.74;
        return power;
    }
    public void loadWeight(double weight){
        if (weight>this.maxWeightOnBoard){
            System.out.println("Вам нужен грузовик побольше");
        } else {
            System.out.println("Грузовик загружен");
        }
    }
    @Override
    public String toString() {
        return "Truck{" +
                "maxWeightOnBoard=" + maxWeightOnBoard +
                ", " + super.toString() + "Мощность в Л.С. = " + calculatePower(this);
    }
}
