package by.teachmeskills.robot.legs;

public class SamsungLeg implements ILeg {

    private int price;

    public SamsungLeg(int price) {
        this.price = price;

    }

    @Override
    public void step() {
        System.out.println("Нога Samsung сделала шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
