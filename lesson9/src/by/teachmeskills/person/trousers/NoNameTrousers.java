package by.teachmeskills.person.trousers;

public class NoNameTrousers implements ITrousers {

    @Override
    public void putOn() {
        System.out.println("Штаны NoName надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны NoName сняты");
    }
}