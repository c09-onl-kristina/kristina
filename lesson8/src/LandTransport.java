abstract public class LandTransport extends Transport {
    public int numberOfWheels;
    public int fuelConsumption;

    @Override
    public String description() {

        return super.description() + ", количество колес " + numberOfWheels +
                ", расход топлива " + fuelConsumption + " л/100км,";
    }
}
