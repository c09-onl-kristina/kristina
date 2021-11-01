package by.teachmeskills.person;

import by.teachmeskills.person.jacket.IJacket;
import by.teachmeskills.person.shoes.IShoes;
import by.teachmeskills.person.trousers.ITrousers;

public class Person implements IPerson {
    private String name;
    private IShoes shoes;
    private IJacket jacket;
    private ITrousers trousers;

    public Person(String name, IShoes shoes, IJacket jacket, ITrousers trousers) {
        this.name = name;
        this.shoes = shoes;
        this.jacket = jacket;
        this.trousers = trousers;
    }

    @Override
    public void putOn() {
        shoes.putOn();
        jacket.putOn();
        trousers.putOn();
    }

    @Override
    public void takeOff() {
        shoes.takeOff();
        jacket.takeOff();
        trousers.takeOff();
    }

    public String getName() {
        return name;
    }
}