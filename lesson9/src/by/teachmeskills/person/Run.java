package by.teachmeskills.person;

import by.teachmeskills.person.jacket.ColinsJacket;
import by.teachmeskills.person.jacket.GucciJacket;
import by.teachmeskills.person.shoes.CollinsShoes;
import by.teachmeskills.person.shoes.GucciShoes;
import by.teachmeskills.person.shoes.NoNameShoes;
import by.teachmeskills.person.trousers.GucciTrousers;
import by.teachmeskills.person.trousers.NoNameTrousers;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Person person = new Person("Vika", new CollinsShoes(), new GucciJacket(), new NoNameTrousers());
        System.out.println("Человека зовут " + person.getName());
        person.putOn();
        person.takeOff();
    }
}