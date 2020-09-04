package lesson7.maintask.abstractClasses;

public class WarTransport extends AirTransport {
    private boolean catapultSystem;
    private int missilesCount;

    public WarTransport(double power, double maxSpeed, double mass, String brand, double wingsSize, double lengthOfStripe, boolean catapultSystem, int missilesCount) {
        super(power, maxSpeed, mass, brand, wingsSize, lengthOfStripe);
        this.catapultSystem = catapultSystem;
        this.missilesCount = missilesCount;
    }

    public double calculatePower(WarTransport warTransport) {
        double power = warTransport.getPower() * 0.74;
        return power;
    }

    public void shootMissile() {
        if (this.missilesCount > 0) {
            System.out.println("Ракета пошла");
            this.missilesCount--;
        } else {
            System.out.println("Боеприпасов нет");
        }
    }

    public void catapultPilot() {
        if (this.catapultSystem == true) {
            System.out.println("Катапультируемся");
        } else {
            System.out.println("Теперь мы все умрём");
        }
    }

    @Override
    public String toString() {
        return "WarTransport{" +
                "catapultSystem=" + catapultSystem +
                ", missilesCount=" + missilesCount +
                ", " + super.toString() + "Мощность в Л.С. = " + calculatePower(this);
    }
}
