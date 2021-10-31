package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SonyHead(15), new SonyHand(13), new SonyLeg(12));
        robot1.action();
        System.out.println("robot1 стоит " + robot1.getPrice() + "$");

        Robot robot2 = new Robot(new ToshibaHead(19), new SamsungHand(15), new SonyLeg(12));
        robot2.action();
        System.out.println("robot2 стоит " + robot2.getPrice() + "$");

        Robot robot3 = new Robot(new SamsungHead(22), new SonyHand(13), new ToshibaLeg(10));
        robot2.action();
        System.out.println("robot3 стоит " + robot3.getPrice() + "$");

        ArrayList<Robot> robots = new ArrayList<Robot>();
        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot3);
        Robot expensiveRobot = robot1;

        for (Robot robot : robots) {
            if (robot.getPrice() > expensiveRobot.getPrice()) {
                expensiveRobot = robot;
            }
        }

        System.out.println("Самый дорогой робот стоит " + expensiveRobot.getPrice() + "$");


        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}