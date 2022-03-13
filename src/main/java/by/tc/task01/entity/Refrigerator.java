package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class Refrigerator extends Appliance{

    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator(double powerConsumption, double weight,
                        double freezerCapacity, double overallCapacity,
                        double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public Refrigerator(Map<String, Object> keyValueSet) {
        for (Map.Entry entry : keyValueSet.entrySet()) {
            if (entry.getValue().equals(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())) {
                this.powerConsumption = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Refrigerator.WEIGHT.toString())) {
                this.weight = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())) {
                this.freezerCapacity = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())) {
                this.overallCapacity = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Refrigerator.HEIGHT.toString())) {
                this.height = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Refrigerator.WIDTH.toString())) {
                this.width = new Double(entry.getValue().toString());
            }
        }
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
