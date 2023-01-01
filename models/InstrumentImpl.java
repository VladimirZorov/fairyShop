package fairyShop.models;

public abstract class InstrumentImpl implements Instrument{

    private int power;

    public InstrumentImpl(int power) {
        this.power = power;
    }

    @Override
    public int getPower() {
        return 0;
    }

    @Override
    public void use() {

    }

    @Override
    public boolean isBroken() {
        return false;
    }
}
