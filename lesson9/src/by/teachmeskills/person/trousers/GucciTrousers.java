package by.teachmeskills.person.trousers;

public class GucciTrousers implements ITrousers {

    @Override
    public void putOn() {
        System.out.println("Штаны Gucci надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны Gucci сняты");
    }
}