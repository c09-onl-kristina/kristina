package by.teachmeskills.person.jacket;

public class NoNameJacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Куртка NoName надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка NoName снята");
    }
}