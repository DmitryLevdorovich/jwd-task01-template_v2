package by.tc.task01.entity;

public interface ApplianceBuilder {

    public Appliance build(String[] values);

    public void setPowerSupply(double powerSupplyValue);
    public void setDimensions(double width, double height, double depth);
    public void setDisplaySize(double displaySize);
    public void setCapacity(double capacity);
    public void setMemory(int ram, int rom);
    public void setCPU(double cpu);
    public void setOS(String osString);
    public void setWeight(double weight);
    public void setFreezerCapacity(double freezerCapacity);
    public void setSpeakersNumber(int number);
    public void setFrequencyRange(String frequencyRange);
    public void setColour(String colour);
    public void setVCAccessories(String filterType, String bagType, String wandType);
    public void setMotorSpeed(double motorSpeed);
    public void setLength(double length);
}
