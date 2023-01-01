package fairyShop.models;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseHelper implements Helper{

    private String name;
    private int energy;
    private  Collection<Instrument> instruments;

    public BaseHelper(String name, int energy) {
        this.name = name;
        this.energy = energy;
        this.instruments = new ArrayList<>();
    }

    @Override
    public void work() {

    }

    @Override
    public void addInstrument(Instrument instrument) {

    }

    @Override
    public boolean canWork() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getEnergy() {
        return 0;
    }

    @Override
    public Collection<Instrument> getInstruments() {
        return null;
    }
}
