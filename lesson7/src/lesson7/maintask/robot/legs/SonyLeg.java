package lesson7.maintask.robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg(){

    }

    @Override
    public void step() {
        System.out.println("1 step Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
