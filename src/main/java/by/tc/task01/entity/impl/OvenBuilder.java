package by.tc.task01.entity.impl;

import by.tc.task01.entity.ApplianceBuilder;
import by.tc.task01.entity.Oven;

public class OvenBuilder implements ApplianceBuilder {

    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    @Override
    public void setPowerSupply(double powerSupplyValue) {
        this.powerConsumption = powerSupplyValue;
    }

    @Override
    public void setDimensions(double width, double height, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    @Override
    public void setDisplaySize(double displaySize) { }

    @Override
    public void setCapacity(double capacity) {
        this.capacity = capacity;
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
    public void setFreezerCapacity(double freezerCapacity) { }

    @Override
    public void setSpeakersNumber(int number) {

    }

    @Override
    public void setFrequencyRange(String frequencyRange) {

    }

    @Override
    public void setColour(String colour) {

    }

    @Override
    public void setVCAccessories(String filterType, String bagType, String wandType) {

    }

    @Override
    public void setMotorSpeed(double motorSpeed) {

    }

    @Override
    public void setLength(double length) {

    }

    public Oven getOven() {
        return new Oven(powerConsumption, weight, capacity, depth,
                height, width);
    }
}
