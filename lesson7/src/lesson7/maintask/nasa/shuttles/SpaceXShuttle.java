package lesson7.maintask.nasa.shuttles;

import lesson7.maintask.nasa.IStart;

public class SpaceXShuttle implements IStart {
    boolean elonMuskIsSick;

    public SpaceXShuttle(boolean elonMuskIsSick) {
        this.elonMuskIsSick = elonMuskIsSick;
    }

    @Override
    public boolean checkSystem() {
       return !elonMuskIsSick;
    }

    @Override
    public void startEngine() {
        System.out.println("Ура!");
    }

    @Override
    public void start() {
        System.out.println("Очередной Starlink запущен");
    }
}
