public abstract class Transport {
    public void setPower(int power) {
        this.power = power;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    protected int power;
    protected int maxSpeed;
    protected int weight;
    protected String brand;

    public String description() {
        return "Мощность " + power + " л.с.," + " мощность в кв " + powerInKV() +
                ", максимальная скорость " + maxSpeed + " км/ч," +
                " масса " + weight + " кг, марка " + brand;
    }

    public double powerInKV() {
        return 0.74 * power;
    }

}
