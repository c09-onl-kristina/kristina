public class CivilTransport extends AirTransport {
    public int numberOfPassengers;
    public boolean businessClassAvailability;

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
