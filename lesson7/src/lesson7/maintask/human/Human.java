package lesson7.maintask.human;

import lesson7.maintask.human.jackets.IJacket;
import lesson7.maintask.human.pants.IPants;
import lesson7.maintask.human.shoes.IShoes;

public class Human  {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public void takeOnAll(){
        jacket.takeOn();
        pants.takeOn();
        shoes.takeOn();
    }

    public void takeOffAll(){
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
