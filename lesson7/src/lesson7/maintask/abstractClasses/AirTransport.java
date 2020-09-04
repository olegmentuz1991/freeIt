package lesson7.maintask.abstractClasses;

public abstract class AirTransport extends Transport {
    private double wingsSize;
    private double lengthOfStripe;

    public double getWingsSize() {
        return wingsSize;
    }

    public void setWingsSize(double wingsSize) {
        this.wingsSize = wingsSize;
    }

    public double getLengthOfStripe() {
        return lengthOfStripe;
    }

    public void setLengthOfStripe(double lengthOfStripe) {
        this.lengthOfStripe = lengthOfStripe;
    }

    @Override
    public String toString() {
        return
                "wingsSize=" + wingsSize +
                ", lengthOfStripe=" + lengthOfStripe +
                ", " + super.toString();
    }

    public AirTransport(double power, double maxSpeed, double mass, String brand, double wingsSize, double lengthOfStripe) {
        super(power, maxSpeed, mass, brand);
        this.wingsSize = wingsSize;
        this.lengthOfStripe = lengthOfStripe;
    }
}
