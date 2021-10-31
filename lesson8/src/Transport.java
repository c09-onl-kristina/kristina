abstract public class Transport {
    public int power;
    public int maxSpeed;
    public int weight;
    public String brand;

    public String description() {
        return "Мощность " + power + " л.с.," + " мощность в кв " + powerInKV() +
                ", максимальная скорость " + maxSpeed + " км/ч," +
                " масса " + weight + " кг, марка " + brand;
    }

    public double powerInKV() {
        return 0.74 * power;
    }

}
