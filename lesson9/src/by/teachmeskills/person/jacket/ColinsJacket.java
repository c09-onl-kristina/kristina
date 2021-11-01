package by.teachmeskills.person.jacket;

public class ColinsJacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Куртка Colins надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка Colins снята");
    }
}