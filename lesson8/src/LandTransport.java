public abstract class LandTransport extends Transport {
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected int numberOfWheels;
    protected int fuelConsumption;

    @Override
    public String description() {

        return super.description() + ", количество колес " + numberOfWheels +
                ", расход топлива " + fuelConsumption + " л/100км,";
    }
}
