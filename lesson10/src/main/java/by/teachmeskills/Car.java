package by.teachmeskills;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
public class Car {
    private String name;
    private int price;
    private int speed;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.engine = engine;
        this.name = name;
    }


    public void start() throws CarException {
        Random random = new Random();
        int number = random.nextInt(20);
        if (number % 2 == 0) {
            throw new CarException("Неисправность двигателя");
        }
    }


}
