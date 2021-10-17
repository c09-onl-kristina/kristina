import java.util.ArrayList;

public class MilitaryOffice {
    ArrayList<Person> personRegistry = new ArrayList<>();

    public MilitaryOffice(ArrayList<Person> personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void conscripts() {
        for (Person person : personRegistry) {
            if (person.age > 17 && person.age < 28 && person.sex.equals("M")) {
                System.out.print(person.name + " ");
            }
        }
        System.out.println();
    }

    public void minsk() {
        for (Person person : personRegistry) {
            if (person.age > 17 && person.age < 28 && person.sex.equals("M") && person.address.city.equals("Minsk")) {
                System.out.print(person.name + " ");
            }
        }
        System.out.println();
    }

    public void age2527() {
        for (Person person : personRegistry) {
            if (person.age > 24 && person.age < 28 && person.sex.equals("M")) {
                System.out.print(person.name + " ");
            }
        }
        System.out.println();
    }

    public void alexandr() {
        int counter = 0;
        for (Person person : personRegistry) {
            if (person.age > 17 && person.age < 28 && person.sex.equals("M") && person.name.equals("Aleksandr")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
