public class Engine {
    private boolean engineOn = false;

    public void on() {
        System.out.println("Двигатель включен");
        engineOn = true;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void off() {
        System.out.println("Двигатель выключен");
        engineOn = false;
    }
}
