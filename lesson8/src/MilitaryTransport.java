public class MilitaryTransport extends AirTransport {
    public boolean catapultSystem;
    public int numberOfMissilesOnBoard;

    @Override
    public String description() {
        return super.description() +
                ", наличие системы катапультирования " + catapultSystem +
                ", количество ракет на борту " + numberOfMissilesOnBoard;
    }

    public void shot() {
        if (numberOfMissilesOnBoard > 0) {
            System.out.println("Ракета пошла...");
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
