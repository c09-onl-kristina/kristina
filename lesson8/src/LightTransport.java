public class LightTransport extends LandTransport {
    public String bodyType;
    public int numberOfPassengers;

    @Override
    public String description() {
        return super.description() +
                " тип кузова " + bodyType + ", количество пассажиров " + numberOfPassengers;
    }

    public void calculationOfConsumedFuel(int time) {
        System.out.println("За время " + time + " ч, автомобиль " + brand +
                " двигаясь с максимальной скоростью " + maxSpeed +
                " км/ч проедет " + time * maxSpeed + " км и израсходует "
                + fuelConsumption(time) + " литров топлива.");
    }

    private double fuelConsumption(int time) {
        return (double) fuelConsumption / 100 * time * maxSpeed;
    }
}
