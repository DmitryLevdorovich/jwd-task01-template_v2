package by.tc.task01.entity.impl;

import by.tc.task01.entity.ApplianceBuilder;
import by.tc.task01.entity.TabletPC;

public class TabletPCBuilder implements ApplianceBuilder {

    private double batteryCapacity;
    private String operationSystem;
    private double displayInches;
    private int memoryRAM;
    private int flashMemoryCapacity;
    private String colour;

    public TabletPC getTabletPC() {
        return new TabletPC(batteryCapacity, operationSystem, displayInches,
                memoryRAM, flashMemoryCapacity, colour);
    }

    @Override
    public void setPowerSupply(double powerSupplyValue) {
        this.batteryCapacity = powerSupplyValue;
    }

    @Override
    public void setDimensions(double width, double height, double depth) { }

    @Override
    public void setDisplaySize(double displaySize) {
        this.displayInches = displaySize;
    }

    @Override
    public void setCapacity(double capacity) { }

    @Override
    public void setMemory(int ram, int rom) {
        this.memoryRAM = ram;
        this.flashMemoryCapacity = rom;
    }

    @Override
    public void setCPU(double cpu) { }

    @Override
    public void setOS(String osString) {
        this.operationSystem = osString;
    }

    @Override
    public void setWeight(double weight) { }

    @Override
    public void setFreezerCapacity(double freezerCapacity) { }

    @Override
    public void setSpeakersNumber(int number) { }

    @Override
    public void setFrequencyRange(String frequencyRange) { }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void setVCAccessories(String filterType, String bagType, String wandType) { }

    @Override
    public void setMotorSpeed(double motorSpeed) { }

    @Override
    public void setLength(double length) { }
}
