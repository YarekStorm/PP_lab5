package example.models;

public abstract class Ammunition {
    private String name;
    private double weight;
    private double cost;

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public abstract String getDescription();
}
