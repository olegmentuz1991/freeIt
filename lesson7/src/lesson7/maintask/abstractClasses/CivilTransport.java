package lesson7.maintask.abstractClasses;

public class CivilTransport extends AirTransport {
    private int maxPassengers;
    private boolean buisenessClass;

    public CivilTransport(double power, double maxSpeed, double mass, String brand, double wingsSize, double lengthOfStripe, int maxPassengers, boolean buisenessClass) {
        super(power, maxSpeed, mass, brand, wingsSize, lengthOfStripe);
        this.maxPassengers = maxPassengers;
        this.buisenessClass = buisenessClass;
    }
    public double calculatePower(CivilTransport civilTransport) {
        double power = civilTransport.getPower()*0.74;
        return power;
    }
    @Override
    public String toString() {
        return "CivilTransport{" +
                "maxPassengers=" + maxPassengers +
                ", buisenessClass=" + buisenessClass +
                ", " + super.toString() + "Мощность в Л.С. = " + calculatePower(this);
    }
}
