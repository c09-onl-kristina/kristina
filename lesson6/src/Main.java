import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personRegistry = new ArrayList<>();
        personRegistry.add(new Person("Aleksandr", "M", 18, new Address("BY", "Minsk")));
        personRegistry.add(new Person("Aleksandr", "M", 26, new Address("BY", "Gomel")));
        personRegistry.add(new Person("Oleg", "M", 13, new Address("BY", "Minsk")));
        personRegistry.add(new Person("Marina", "F", 19, new Address("BY", "Minsk")));
        personRegistry.add(new Person("Nikolay", "M", 25, new Address("BY", "Mogilev")));

        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        militaryOffice.conscripts();
        militaryOffice.minsk();
        militaryOffice.age2527();
        militaryOffice.alexandr();
    }
}
