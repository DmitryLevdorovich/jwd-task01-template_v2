package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.lang.reflect.Field;
import java.util.Map;

public class Laptop extends Appliance{

    private double batteryCapacity;
    private String operationSystem;
    private double memoryROM;
    private double systemMemory;
    private double cpu;
    private double displayInches;

    public Laptop(double batteryCapacity, String operationSystem,
                  double memoryROM, double systemMemory, double cpu,
                  double displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.operationSystem = operationSystem;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;

    }

    public Laptop(Map<String, Object> keyValueSet) {
        for(Map.Entry entry : keyValueSet.entrySet()) {
            if (entry.getValue().equals(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
                this.batteryCapacity = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Laptop.OS.toString())) {
                this.operationSystem = entry.getValue().toString();
            } else if (entry.getValue().equals(SearchCriteria.Laptop.MEMORY_ROM.toString())) {
                this.memoryROM = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())) {
                this.systemMemory = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Laptop.CPU.toString())) {
                this.cpu = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Laptop.DISPLAY_INCHS.toString())) {
                this.displayInches = new Double(entry.getValue().toString());
            }
        }
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }
}
