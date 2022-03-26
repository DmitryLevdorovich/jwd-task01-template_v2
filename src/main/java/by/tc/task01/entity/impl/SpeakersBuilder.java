package by.tc.task01.entity.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceBuilder;
import by.tc.task01.entity.Speakers;

import java.io.Serializable;

public class SpeakersBuilder implements ApplianceBuilder, Serializable {

    private double powerSupply;
    private int numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    @Override
    public void setPowerSupply(double powerSupplyValue) {
        this.powerSupply = powerSupplyValue;
    }

    @Override
    public void setDimensions(double width, double height, double depth) {}

    @Override
    public void setDisplaySize(double displaySize) {}

    @Override
    public void setCapacity(double capacity) {}

    @Override
    public void setMemory(int ram, int rom) {}

    @Override
    public void setCPU(double cpu) {}

    @Override
    public void setOS(String osString) {}

    @Override
    public void setWeight(double weight) {}

    @Override
    public void setFreezerCapacity(double freezerCapacity) {}

    @Override
    public void setSpeakersNumber(int number) {
        this.numberOfSpeakers = number;
    }

    @Override
    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    @Override
    public void setColour(String colour) { }

    @Override
    public void setVCAccessories(String filterType, String bagType, String wandType) { }

    @Override
    public void setMotorSpeed(double motorSpeed) { }

    @Override
    public void setLength(double length) {
        this.cordLength = length;
    }

    public Appliance build(String[] parameters) {

        setPowerSupply(Double.parseDouble(parameters[0]));
        setSpeakersNumber(Integer.parseInt(parameters[1]));
        setFrequencyRange(parameters[2]);
        setLength(Double.parseDouble(parameters[3]));
        return new Speakers(powerSupply, numberOfSpeakers, frequencyRange, cordLength);
    }
}
