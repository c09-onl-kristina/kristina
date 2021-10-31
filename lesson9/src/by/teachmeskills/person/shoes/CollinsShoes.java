package by.teachmeskills.person.shoes;

public class CollinsShoes implements IShoes {

    @Override
    public void putOn() {
        System.out.println("Туфли Collins надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Туфли Collins сняты");
    }
}