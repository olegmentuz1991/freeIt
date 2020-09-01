package lesson7.maintask.robot;

import lesson7.maintask.robot.hands.SamsungHand;
import lesson7.maintask.robot.hands.SonyHand;
import lesson7.maintask.robot.heads.SamsungHead;
import lesson7.maintask.robot.heads.SonyHead;
import lesson7.maintask.robot.heads.ToshibaHead;
import lesson7.maintask.robot.legs.SamsungLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot walle = new Robot(new SamsungHead(17),new SonyHand(12),new SamsungLeg(22));
        Robot eva = new Robot(new ToshibaHead(20),new SamsungHand(32),new SamsungLeg(11));
        Robot c3po = new Robot(new SonyHead(10),new SonyHand(30), new SamsungLeg(23));
        walle.action();
        eva.action();
        c3po.action();

        if ((walle.getPrice()>eva.getPrice())&&(walle.getPrice()>c3po.getPrice())){
            System.out.println("Most expensive - walle. Price = " + walle.getPrice());
        } else if((eva.getPrice()>walle.getPrice())&&(walle.getPrice()>c3po.getPrice())) {
            System.out.println("Most expensive - eva. Price = " + eva.getPrice());
        } else  System.out.println("Most expencive c3po. Price = " + c3po.getPrice());
    }
}
