package example.models;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Ammunition> ammunitionList = new ArrayList<>();

    public void addAmmunition(Ammunition ammunition) {}

    public void removeAmmunition(Ammunition ammunition) {}

    public void sortByWeight() {}

    public List<Ammunition> findByPriceRange(double minPrice, double maxPrice) {
        return new ArrayList<>();
    }

    public List<Ammunition> getAllAmmunition() {
        return ammunitionList;
    }
}
