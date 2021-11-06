package by.teachmeskills;

public class DieselEngine implements Engine{

    private boolean engineOn = false;

    public void on() {
        System.out.println("Дизельный двигатель включен");
        engineOn = true;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void off() {
        System.out.println("Дизельный двигатель выключен");
        engineOn = false;
    }
}
