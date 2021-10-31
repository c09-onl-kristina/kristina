public class AirTransport extends Transport {
    public int wingspan;
    public int minimumRunwayLengthForTakeOff;

    @Override
    public String description() {
        return super.description() +
                " размах крыльев " + wingspan + " м" +
                ", минимальная длина взлётно-посадочной полосы для взлёта " + minimumRunwayLengthForTakeOff;
    }
}
