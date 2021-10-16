package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(5, 3, 7);
        computer.description();
        computer.on();
        computer.off();
    }
}
