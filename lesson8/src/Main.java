public class Main {
    public static void main(String[] args) {

        LightTransport lightTransport = new LightTransport();
        lightTransport.setMaxSpeed(10);
        lightTransport.setFuelConsumption(3);
        lightTransport.setBrand("BMV");
        lightTransport.setNumberOfPassengers(4);
        lightTransport.setNumberOfWheels(4);
        lightTransport.setPower(7);
        lightTransport.setWeight(2);
        lightTransport.setBodyType("cедан");
        System.out.println(lightTransport.description());
        lightTransport.calculationOfConsumedFuel(5);

        FreightTransport freightTransport = new FreightTransport();
        freightTransport.setMaxSpeed(10);
        freightTransport.setFuelConsumption(3);
        freightTransport.setBrand("BMV");
        freightTransport.setNumberOfWheels(12);
        freightTransport.setPower(9);
        freightTransport.setCarryingCapacity(12);
        System.out.println(freightTransport.description());
        freightTransport.willThereBeEnoughSpace(4);

        CivilTransport civilTransport = new CivilTransport();
        civilTransport.setMaxSpeed(1101);
        civilTransport.setBrand("Boeing");
        civilTransport.setNumberOfPassengers(100);
        civilTransport.setPower(10);
        civilTransport.setWeight(10);
        civilTransport.setBusinessClassAvailability(true);
        civilTransport.setMinimumRunwayLengthForTakeOff(13);
        civilTransport.setWingspan(15);
        System.out.println(civilTransport.description());
        civilTransport.willThereBeEnoughSpace(43);

        MilitaryTransport militaryTransport = new MilitaryTransport();
        militaryTransport.setMaxSpeed(1231);
        militaryTransport.setBrand("Boeing");
        militaryTransport.setPower(7);
        militaryTransport.setWeight(10);
        militaryTransport.setMinimumRunwayLengthForTakeOff(13);
        militaryTransport.setWingspan(3);
        militaryTransport.setNumberOfMissilesOnBoard(5);
        militaryTransport.setCatapultSystem(true);
        System.out.println(militaryTransport.description());
        militaryTransport.shot();
        militaryTransport.catapult();
    }
}
