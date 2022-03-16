package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;

public class Refrigerator implements Appliance {

    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double depth;
    private double height;
    private double width;

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
