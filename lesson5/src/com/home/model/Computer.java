package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    int processor;
    int ram;
    int resource;

    public Computer(int processor, int ram, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.resource = resource;
    }

    public void description() {
        System.out.println("Процессор " + processor);
        System.out.println("Память " + ram);
        System.out.println("Ресурс " + resource);
    }

    public void on() {
        if (resource > 0) {
            Random random = new Random();
            int number = random.nextInt(2);
            Scanner scanner = new Scanner(System.in);
            int myNumber;
            System.out.println("Внимание! Введите 0 или 1");
            while (true) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Ошибка! Введите 0 или 1");
                    scanner.next();
                }
                myNumber = scanner.nextInt();
                if (myNumber == 0 || myNumber == 1) {
                    break;
                } else {
                    System.out.println("Ошибка! Введите 0 или 1");
                }
            }
            if (number == myNumber) {
                off();
            } else {
                System.out.println("Компьютер сгорел!");
                resource = 0;
            }
        } else {
            System.out.println("Компьютер сгорел!");
        }
        resource--;
    }

    public void off() {
        if (resource > 0) {
            Random random = new Random();
            int number = random.nextInt(2);
            Scanner scanner = new Scanner(System.in);
            int myNumber;
            System.out.println("Внимание! Введите 0 или 1");
            while (true) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Ошибка! Введите 0 или 1");
                    scanner.next();
                }
                myNumber = scanner.nextInt();
                if (myNumber == 0 || myNumber == 1) {
                    break;
                } else {
                    System.out.println("Ошибка! Введите 0 или 1");
                }
            }

            if (number != myNumber) {
                System.out.println("Компьютер сгорел!");
                resource = 0;
            }
        } else {
            System.out.println("Компьютер сгорел!");
        }
        resource--;
    }
}
