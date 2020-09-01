package lesson7.maintask.nasa;

import org.w3c.dom.ls.LSInput;

public class Cosmodrome {

    public void launch(IStart start){
        if (!start.checkSystem()){
            System.out.println("Предстартовая проверка провалена");
        } else {
            start.startEngine();
            for (int i =10; i>0;i--) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            start.start();
        }
    }
}
