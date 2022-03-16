package by.tc.task01.entity.impl;

import by.tc.task01.entity.ApplianceBuilder;
import by.tc.task01.entity.Laptop;

public class LaptopBuilder implements ApplianceBuilder {

    private double powerSupply;
    private String operationSystem;
    private int memoryROM;
    private int memoryRAM;
    private double cpu;
    private double displayInches;

    @Override
    public void setPowerSupply(double powerSupplyValue) {
        this.powerSupply = powerSupplyValue;
    }

    @Override
    public void setDimensions(double width, double height, double depth) { }

    @Override
    public void setDisplaySize(double displayInchesValue) {
        this.displayInches = displayInchesValue;
    }

    @Override
    public void setCapacity(double capacity) { }

    @Override
    public void setMemory(int memoryROM, int memoryRAM) {
        this.memoryROM = memoryROM;
        this.memoryRAM = memoryRAM;
    }

    @Override
    public void setCPU(double cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setOS(String os) {
        this.operationSystem = os;
    }

    @Override
    public void setWeight(double weight) { }

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

    public Laptop getLaptop() {
        return new Laptop(powerSupply, operationSystem, memoryROM, memoryRAM,
                cpu, displayInches);
    }
}
