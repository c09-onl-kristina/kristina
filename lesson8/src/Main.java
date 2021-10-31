public class Main {
    public static void main(String[] args) {

        LightTransport lightTransport = new LightTransport();
        lightTransport.maxSpeed = 10;
        lightTransport.fuelConsumption = 3;
        lightTransport.brand = "BMV";
        lightTransport.numberOfPassengers = 4;
        lightTransport.numberOfWheels = 4;
        lightTransport.power = 7;
        lightTransport.weight = 2;
        lightTransport.bodyType = "cедан";
        System.out.println(lightTransport.description());
        lightTransport.calculationOfConsumedFuel(5);

        FreightTransport freightTransport = new FreightTransport();
        freightTransport.maxSpeed = 10;
        freightTransport.fuelConsumption = 3;
        freightTransport.brand = "BMV";
        freightTransport.numberOfWheels = 12;
        freightTransport.power = 7;
        freightTransport.weight = 9;
        freightTransport.carryingCapacity = 12;
        System.out.println(freightTransport.description());
        freightTransport.willThereBeEnoughSpace(4);

        CivilTransport civilTransport = new CivilTransport();
        civilTransport.maxSpeed = 1001;
        civilTransport.brand = "Boeing";
        civilTransport.numberOfPassengers = 100;
        civilTransport.power = 7;
        civilTransport.weight = 10;
        civilTransport.businessClassAvailability = true;
        civilTransport.minimumRunwayLengthForTakeOff = 13;
        civilTransport.wingspan = 3;
        System.out.println(civilTransport.description());
        civilTransport.willThereBeEnoughSpace(43);

        MilitaryTransport militaryTransport = new MilitaryTransport();
        militaryTransport.maxSpeed = 1231;
        militaryTransport.brand = "Boeing";
        militaryTransport.power = 7;
        militaryTransport.weight = 10;
        militaryTransport.minimumRunwayLengthForTakeOff = 13;
        militaryTransport.wingspan = 3;
        militaryTransport.numberOfMissilesOnBoard = 5;
        militaryTransport.catapultSystem = true;
        System.out.println(militaryTransport.description());
        militaryTransport.shot();
        militaryTransport.catapult();
    }
}
