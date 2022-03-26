package by.tc.task01.entity.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceBuilder;
import by.tc.task01.entity.Refrigerator;

import java.io.Serializable;

public class RefrigeratorBuilder implements ApplianceBuilder, Serializable {

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

    public Appliance build(String[] parameters) {
        setPowerSupply(Double.parseDouble(parameters[0]));
        setWeight(Double.parseDouble(parameters[1]));
        setFreezerCapacity(Double.parseDouble(parameters[2]));
        setCapacity(Double.parseDouble(parameters[3]));
        setDimensions(Double.parseDouble(parameters[4]),
                Double.parseDouble(parameters[5]), Double.parseDouble(parameters[6]));
        return new Refrigerator(powerSupply, weight, freezerCapacity,
                overallCapacity, depth, height, width);
    }
}
