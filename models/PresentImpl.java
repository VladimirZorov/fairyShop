package fairyShop.models;

public abstract class PresentImpl implements Present{

    private String name;
    private int energyRequired;

    public PresentImpl(String name, int energyRequired) {
        this.name = name;
        this.energyRequired = energyRequired;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getEnergyRequired() {
        return 0;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public void getCrafted() {

    }
}
