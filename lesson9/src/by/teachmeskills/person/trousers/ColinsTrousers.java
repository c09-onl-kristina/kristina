package by.teachmeskills.person.trousers;

public class ColinsTrousers implements ITrousers {

    @Override
    public void putOn() {
        System.out.println("Штаны Colins надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны Colins сняты");
    }
}