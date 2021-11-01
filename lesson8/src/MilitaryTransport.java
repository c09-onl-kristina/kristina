public class MilitaryTransport extends AirTransport {
    public void setCatapultSystem(boolean catapultSystem) {
        this.catapultSystem = catapultSystem;
    }

    public void setNumberOfMissilesOnBoard(int numberOfMissilesOnBoard) {
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }

    protected boolean catapultSystem;
    protected int numberOfMissilesOnBoard;

    @Override
    public String description() {
        return super.description() +
                ", наличие системы катапультирования " + catapultSystem +
                ", количество ракет на борту " + numberOfMissilesOnBoard;
    }

    public void shot() {
        if (numberOfMissilesOnBoard > 0) {
            System.out.println("Ракета пошла...");
            numberOfMissilesOnBoard--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult() {
        if (catapultSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
