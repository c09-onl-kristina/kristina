package by.teachmeskills.person.jacket;

public class GucciJacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Куртка Gucci надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка Gucci снята");
    }
}