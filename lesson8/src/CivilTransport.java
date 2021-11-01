public class CivilTransport extends AirTransport {
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setBusinessClassAvailability(boolean businessClassAvailability) {
        this.businessClassAvailability = businessClassAvailability;
    }

    protected int numberOfPassengers;
    protected boolean businessClassAvailability;

    @Override
    public String description() {
        return super.description() +
                ", количество пассажиров " + numberOfPassengers +
                ", наличие бизнес класса " + businessClassAvailability;
    }

    public void willThereBeEnoughSpace(int numberOfPassengers) {
        if (this.numberOfPassengers >= numberOfPassengers) {
            System.out.println("Пассажиры рассажены");
        } else {
            System.out.println("Вам нужен транспорт побольше");
        }
    }
}
