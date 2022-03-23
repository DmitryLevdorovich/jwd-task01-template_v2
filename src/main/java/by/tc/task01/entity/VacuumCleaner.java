package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class VacuumCleaner implements Appliance, Serializable {

    private static final long serialVersionUID = 6664884105112458357L;

    private double powerConsumption;
    private double capacity;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner(double powerConsumption, double capacity, String filterType,
                         String bagType, String wandType,
                         double motorSpeedRegulation, double cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.capacity = capacity;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0 &&
                Double.compare(that.capacity, capacity) == 0 &&
                Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0 &&
                Double.compare(that.cleaningWidth, cleaningWidth) == 0 &&
                Objects.equals(filterType, that.filterType) &&
                Objects.equals(bagType, that.bagType) &&
                Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, capacity, filterType,
                bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    public String toString() {
        String className = this.getClass().getSimpleName();
        String[] values = getValues();
        SearchCriteria.VacuumCleaner[] names = SearchCriteria.VacuumCleaner.values();
        StringBuilder result = new StringBuilder(className + " : ");
        for(int i = 0; i < names.length; i++) {
            result.append(names[i]).append("=").append(values[i]);
        }
        return result.toString();
    }

    private String[] getValues() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add(Double.toString(getPowerConsumption()));
        strings.add(Double.toString(getCapacity()));
        strings.add(getFilterType());
        strings.add(getBagType());
        strings.add(getWandType());
        strings.add(Double.toString(getMotorSpeedRegulation()));
        strings.add(Double.toString(getCleaningWidth()));
        return strings.toArray(new String[0]);
    }


}
