package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class TabletPC implements Appliance, Serializable {

    private static final long serialVersionUID = -7168273923491701106L;

    private double batteryCapacity;
    private String operationSystem;
    private double displayInches;
    private int memoryRAM;
    private int flashMemoryCapacity;
    private String colour;

    public TabletPC() {}

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

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public void setMemoryRAM(int memoryRAM) {
        this.memoryRAM = memoryRAM;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(tabletPC.displayInches, displayInches) == 0 &&
                memoryRAM == tabletPC.memoryRAM && flashMemoryCapacity == tabletPC.flashMemoryCapacity &&
                Objects.equals(operationSystem, tabletPC.operationSystem) &&
                Objects.equals(colour, tabletPC.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, operationSystem, displayInches, memoryRAM, flashMemoryCapacity, colour);
    }

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
