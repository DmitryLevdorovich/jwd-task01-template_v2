package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class TabletPC extends Appliance{

    private double batteryCapacity;
    private double displayInches;
    private int memoryROM;
    private int flashMemoryCapacity;
    private String colour;

    public TabletPC(double batteryCapacity, double displayInches,
                    int memoryROM, int flashMemoryCapacity,
                    String colour) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.colour = colour;
    }

    public TabletPC(Map<String, Object> keyValueSet) {
        for(Map.Entry entry : keyValueSet.entrySet()) {
            if (entry.getValue().equals(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())) {
                this.batteryCapacity = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())) {
                this.displayInches = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.TabletPC.MEMORY_ROM.toString())) {
                this.memoryROM = new Integer(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())) {
                this.flashMemoryCapacity = new Integer(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.TabletPC.COLOR.toString())) {
                this.colour = entry.getValue().toString();
            }
        }
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
