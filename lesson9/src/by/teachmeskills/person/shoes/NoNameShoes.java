package by.teachmeskills.person.shoes;

public class NoNameShoes implements IShoes {

    @Override
    public void putOn() {
        System.out.println("Туфли NoName надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Туфли NoName сняты");
    }
}