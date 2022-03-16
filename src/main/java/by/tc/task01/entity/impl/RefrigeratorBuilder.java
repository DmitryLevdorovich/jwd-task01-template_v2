package by.tc.task01.entity.impl;

import by.tc.task01.entity.ApplianceBuilder;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder implements ApplianceBuilder {

    private double powerSupply;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double depth;
    private double height;
    private double width;

    @Override
    public void setPowerSupply(double powerSupplyValue) {
        this.powerSupply = powerSupplyValue;
    }

    @Override
    public void setDimensions(double width, double height, double depth) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    @Override
    public void setDisplaySize(double displaySize) {

    }

    @Override
    public void setCapacity(double capacity) {
        this.overallCapacity = capacity;
    }

    @Override
    public void setMemory(int ram, int rom) { }

    @Override
    public void setCPU(double cpu) { }

    @Override
    public void setOS(String osString) { }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    @Override
    public void setSpeakersNumber(int number) { }

    @Override
    public void setFrequencyRange(String frequencyRange) { }

    @Override
    public void setColour(String colour) { }

    @Override
    public void setVCAccessories(String filterType, String bagType, String wandType) { }

    @Override
    public void setMotorSpeed(double motorSpeed) { }

    @Override
    public void setLength(double length) { }

    public Refrigerator getRefrigerator() {
        return new Refrigerator(powerSupply, weight, freezerCapacity,
                overallCapacity, depth, height, width);
    }
}
