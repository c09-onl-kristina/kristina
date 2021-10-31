public class FreightTransport extends LandTransport {
    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    protected int carryingCapacity;

    @Override
    public String description() {
        return super.description() +
                " грузоподъемность " + carryingCapacity + " т";
    }

    public void willThereBeEnoughSpace(int weight) {
        if (carryingCapacity >= weight) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
