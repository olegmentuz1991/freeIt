package lesson7.maintask.abstractClasses;

public abstract class Transport {
    private double power = 1.3;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private double maxSpeed = 1.2;
    private double mass = 2;
    private String brand = "BMW";


    @Override
    public String toString() {
        return  "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", mass=" + mass +
                ", brand='" + brand + '\'' +
                ", ";
    }

    public Transport(double power, double maxSpeed, double mass, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.brand = brand;
    }
}
