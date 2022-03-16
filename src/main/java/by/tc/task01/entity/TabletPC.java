package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;

public class TabletPC implements Appliance {

    private double batteryCapacity;
    private String operationSystem;
    private double displayInches;
    private int memoryRAM;
    private int flashMemoryCapacity;
    private String colour;

    public TabletPC(double batteryCapacity, String os,
                    double displayInches, int memoryROM,
                    int flashMemoryCapacity, String colour) {
        this.batteryCapacity = batteryCapacity;
        this.operationSystem = os;
        this.displayInches = displayInches;
        this.memoryRAM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.colour = colour;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public int getMemoryRAM() {
        return memoryRAM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColour() {
        return colour;
    }

    public String getOperationSystem() { return operationSystem; }

    public String toString() {
        String className = this.getClass().getSimpleName();
        String[] values = getValues();
        SearchCriteria.TabletPC[] names = SearchCriteria.TabletPC.values();
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
        strings.add(Double.toString(getDisplayInches()));
        strings.add(Integer.toString(getMemoryRAM()));
        strings.add(Integer.toString(getFlashMemoryCapacity()));
        strings.add(getColour());
        return strings.toArray(new String[0]);
    }
}
