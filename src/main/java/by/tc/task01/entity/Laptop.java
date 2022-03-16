package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;

public class Laptop implements Appliance {

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
