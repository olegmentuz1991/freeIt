package lesson7.maintask.robot.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand(){};

    @Override
    public void upHand() {
        System.out.println("Sony, Hand up!");
    }

    @Override
    public int getPrice() {
        return price;
    }

}
