package by.tc.task01.entity.impl;

import by.tc.task01.entity.ApplianceBuilder;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder implements ApplianceBuilder {

    private double powerConsumption;
    private double capacity;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner getVacuumCleaner() {
        return new VacuumCleaner(powerConsumption, capacity, filterType, bagType,
                wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public void setPowerSupply(double powerSupplyValue) {
        this.powerConsumption = powerSupplyValue;
    }

    @Override
    public void setDimensions(double width, double height, double depth) { }

    @Override
    public void setDisplaySize(double displaySize) { }

    @Override
    public void setCapacity(double capacity) { this.capacity = capacity; }

    @Override
    public void setMemory(int ram, int rom) { }

    @Override
    public void setCPU(double cpu) { }

    @Override
    public void setOS(String osString) { }

    @Override
    public void setWeight(double weight) { }

    @Override
    public void setFreezerCapacity(double freezerCapacity) { }

    @Override
    public void setSpeakersNumber(int number) { }

    @Override
    public void setFrequencyRange(String frequencyRange) { }

    @Override
    public void setColour(String colour) { }

    @Override
    public void setVCAccessories(String filterType, String bagType, String wandType) {
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
    }

    @Override
    public void setMotorSpeed(double motorSpeed) {
        this.motorSpeedRegulation = motorSpeed;
    }

    @Override
    public void setLength(double length) {
        this.cleaningWidth = length;
    }
}
