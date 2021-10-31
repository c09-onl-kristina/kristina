public class LightTransport extends LandTransport {
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    protected String bodyType;
    protected int numberOfPassengers;

    @Override
    public String description() {
        return super.description() +
                " тип кузова " + bodyType + ", количество пассажиров " + numberOfPassengers;
    }

    public void calculationOfConsumedFuel(int time) {
        System.out.println("За время " + time + " ч, автомобиль " + brand +
                " двигаясь с максимальной скоростью " + maxSpeed +
                " км/ч проедет " + distance(time) + " км и израсходует "
                + fuelConsumption(time) + " литров топлива.");
    }

    private double distance(int time) {
        return time * maxSpeed;
    }

    private double fuelConsumption(int time) {
        return (double) fuelConsumption / 100 * distance(time);
    }
}
