package fairyShop.repositories;

import fairyShop.models.Helper;

import java.util.ArrayList;
import java.util.Collection;

public class HelperRepository implements Repository{

    private Collection<Helper> helpers = new ArrayList<>();


    @Override
    public Collection getModels() {
        return null;
    }

    @Override
    public void add(Object model) {

    }

    @Override
    public boolean remove(Object model) {
        return false;
    }

    @Override
    public Object findByName(String name) {
        return null;
    }
}
