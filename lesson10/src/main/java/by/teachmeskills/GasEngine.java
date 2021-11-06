package by.teachmeskills;

public class GasEngine implements Engine{

    private boolean engineOn = false;

    public void on() {
        System.out.println("Бензиновый двигатель включен");
        engineOn = true;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void off() {
        System.out.println("Бензиновый двигатель выключен");
        engineOn = false;
    }
}
