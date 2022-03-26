package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Refrigerator implements Appliance, Serializable {

    private static final long serialVersionUID = -8726926441621976643L;

    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double depth;
    private double height;
    private double width;

    public Refrigerator() {}

    public Refrigerator(double powerConsumption, double weight,
                        double freezerCapacity, double overallCapacity,
                        double depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
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

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public double getDepth() { return depth; }

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

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
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
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0 &&
                Double.compare(that.weight, weight) == 0 &&
                Double.compare(that.freezerCapacity, freezerCapacity) == 0 &&
                Double.compare(that.overallCapacity, overallCapacity) == 0 &&
                Double.compare(that.depth, depth) == 0 && Double.compare(that.height, height) == 0 &&
                Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, depth, height, width);
    }

    public String toString() {
        String className = this.getClass().getSimpleName();
        String[] values = getValues();
        SearchCriteria.Refrigerator[] names = SearchCriteria.Refrigerator.values();
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
        strings.add(Double.toString(getFreezerCapacity()));
        strings.add(Double.toString(getOverallCapacity()));
        strings.add(Double.toString(getDepth()));
        strings.add(Double.toString(getHeight()));
        strings.add(Double.toString(getWidth()));
        return strings.toArray(new String[0]);
    }
}
