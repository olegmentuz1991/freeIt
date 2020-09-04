package lesson7.maintask.abstractClasses;

public class Lesson7 {
    public static void main(String[] args) {
        Truck truck = new Truck(891, 5, 234, "Maz", 6, 367, 1567);
        Automobile auto = new Automobile(200, 200, 5, "Kol", 4, 8, "B", 4);
        CivilTransport civilTransport = new CivilTransport(1000, 2, 3, "dsfs", 6, 25, 6, false);
        WarTransport warTransport = new WarTransport(290, 20, 20, "sdf", 100, 7, false, 6);
        System.out.println(warTransport.toString());
        System.out.println(civilTransport.toString());
        System.out.println(auto.toString());
        System.out.println(truck.toString());
        auto.showFuelConsumption(4);
        truck.loadWeight(13000);
        warTransport.shootMissile();
        warTransport.shootMissile();
        warTransport.shootMissile();
        warTransport.shootMissile();
        warTransport.shootMissile();
        warTransport.shootMissile();
        warTransport.shootMissile();
        warTransport.catapultPilot();

    }
}
