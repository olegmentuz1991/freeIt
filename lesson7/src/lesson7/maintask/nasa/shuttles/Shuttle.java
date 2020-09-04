package lesson7.maintask.nasa.shuttles;

import lesson7.maintask.nasa.IStart;

import javax.sound.midi.Soundbank;

public class Shuttle implements IStart {
    @Override
    public boolean checkSystem() {
        int random = (int) (Math.random()*10);
        if (random>3){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шаттла Запущены все системы в норме");

    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла");
    }
}
