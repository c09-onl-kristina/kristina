package by.teachmeskills;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Opel", new GasEngine());
        try {
            car.start();
            System.out.println("Автомобиль " + car.getName() + " завелся");
        } catch (CarException e) {
            System.out.println("Не удалось завести машину " + car.getName() + ": " + e.getMessage());
        }
    }
}
