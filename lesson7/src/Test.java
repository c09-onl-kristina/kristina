public class Test {
    public static void main(String[] args) {


        Car car = new Car(new Engine(), new GasTank());
        car.on();
        car.addGas(3);
        car.gasLevel();
        car.go();
        car.gasLevel();
        car.off();
        car.distance();
    }
}
