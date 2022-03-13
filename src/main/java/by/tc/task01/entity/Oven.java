package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class Oven extends Appliance{

    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

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

    public Oven(Map<String, Object> keyValueSet) {
        for (Map.Entry entry : keyValueSet.entrySet()) {
            if (entry.getValue().equals(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
                this.powerConsumption = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Oven.WEIGHT.toString())) {
                this.weight = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Oven.CAPACITY.toString())) {
                this.capacity = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Oven.DEPTH.toString())) {
                this.depth = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Oven.HEIGHT.toString())) {
                this.height = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Oven.WIDTH.toString())) {
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
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
