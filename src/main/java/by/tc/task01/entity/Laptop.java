package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Laptop implements Appliance, Serializable {

    private static final long serialVersionUID = 3335497120785244381L;

    private double batteryCapacity;
    private String operationSystem;
    private int memoryROM;
    private int memoryRAM;
    private double cpu;
    private double displayInches;

    public Laptop(double batteryCapacity, String operationSystem,
                  int memoryROM, int memoryRAM, double cpu,
                  double displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.operationSystem = operationSystem;
        this.memoryROM = memoryROM;
        this.memoryRAM = memoryRAM;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public int getMemoryRAM() {
        return memoryRAM;
    }

    public double getCpu() {
        return cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public void setMemoryRAM(int memoryRAM) {
        this.memoryRAM = memoryRAM;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 && memoryROM == laptop.memoryROM &&
                memoryRAM == laptop.memoryRAM && Double.compare(laptop.cpu, cpu) == 0 &&
                Double.compare(laptop.displayInches, displayInches) == 0 &&
                Objects.equals(operationSystem, laptop.operationSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, operationSystem, memoryROM, memoryRAM, cpu, displayInches);
    }

    public String toString() {
        String className = this.getClass().getSimpleName();
        String[] values = getValues();
        SearchCriteria.Laptop[] names = SearchCriteria.Laptop.values();
        StringBuilder result = new StringBuilder(className + " : ");
        for(int i = 0; i < names.length; i++) {
            result.append(names[i]).append("=").append(values[i]).append(" ");
        }
        return result.toString();
    }

    private String[] getValues() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add(Double.toString(getBatteryCapacity()));
        strings.add(getOperationSystem());
        strings.add(Integer.toString(getMemoryRAM()));
        strings.add(Integer.toString(getMemoryROM()));
        strings.add(Double.toString(getCpu()));
        strings.add(Double.toString(getDisplayInches()));
        return strings.toArray(new String[0]);
    }

}
