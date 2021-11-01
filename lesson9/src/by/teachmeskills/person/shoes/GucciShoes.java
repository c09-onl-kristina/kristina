package by.teachmeskills.person.shoes;

public class GucciShoes implements IShoes {

    @Override
    public void putOn() {
        System.out.println("Туфли Gucci надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Туфли Gucci сняты");
    }
}