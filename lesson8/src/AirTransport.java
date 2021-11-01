public class AirTransport extends Transport {
    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public void setMinimumRunwayLengthForTakeOff(int minimumRunwayLengthForTakeOff) {
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
    }

    protected int wingspan;
    protected int minimumRunwayLengthForTakeOff;

    @Override
    public String description() {
        return super.description() +
                " размах крыльев " + wingspan + " м" +
                ", минимальная длина взлётно-посадочной полосы для взлёта " + minimumRunwayLengthForTakeOff;
    }
}
