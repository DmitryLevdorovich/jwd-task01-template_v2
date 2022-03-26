package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Oven implements Appliance, Serializable {

    private static final long serialVersionUID = 6283958095482609458L;

    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {}

    public Oven(double powerConsumption, double weight,
                double capacity, double depth,
                double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return Double.compare(oven.powerConsumption, powerConsumption) == 0 &&
                Double.compare(oven.weight, weight) == 0 && Double.compare(oven.capacity, capacity) == 0 &&
                Double.compare(oven.depth, depth) == 0 && Double.compare(oven.height, height) == 0 &&
                Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    public String toString() {
        String className = this.getClass().getSimpleName();
        String[] values = getValues();
        SearchCriteria.Oven[] names = SearchCriteria.Oven.values();
        StringBuilder result = new StringBuilder(className + " : ");
        for(int i = 0; i < names.length; i++) {
            result.append(names[i]).append("=").append(values[i]).append(" ");
        }
        return result.toString();
    }

    private String[] getValues() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add(Double.toString(getPowerConsumption()));
        strings.add(Double.toString(getHeight()));
        strings.add(Double.toString(getCapacity()));
        strings.add(Double.toString(getDepth()));
        strings.add(Double.toString(getHeight()));
        strings.add(Double.toString(getWidth()));
        return strings.toArray(new String[0]);
    }
}
