public class Car {
    private final Engine engine;
    private GasTank gasTank;
    private int distance = 0;

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public void on() {
        if (gasTank.getGasLevel() > 0) {
            engine.on();
        }
    }

    public void off() {
        engine.off();
    }

    public void go() {
        if (engine.isEngineOn()) {
            System.out.println("Машина поехала");
            distance++;
            gasTank.gasСonsumption(1);
        } else {
            System.out.println("Машина не заведена");
        }
    }

    public void distance() {
        System.out.println("Машина проехала " + distance + " км");
    }

    public void addGas(int gas) {
        gasTank.addGas(gas);
    }

    public void gasLevel() {
        System.out.println("Уровень топлива: " + gasTank.getGasLevel());
    }
}
