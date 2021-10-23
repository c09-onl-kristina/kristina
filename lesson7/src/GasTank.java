public class GasTank {
    private int gasLevel = 7;
    private int volume = 20;

    public int getGasLevel() {
        return gasLevel;
    }

    public void addGas(int gas) {
        if (gasLevel + gas <= volume) {
            gasLevel += gas;
        } else {
            gasLevel = volume;
        }
    }

    public void gasСonsumption(int gas) {
        gasLevel -= gas;
    }
}
