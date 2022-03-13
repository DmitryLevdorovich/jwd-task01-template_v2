package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class VacuumCleaner extends Appliance{

    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner(double powerConsumption, String filterType,
                         String bagType, String wandType,
                         double motorSpeedRegulation, double cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner(Map<String, Object> keyValueSet) {
        for (Map.Entry entry : keyValueSet.entrySet()) {
            if (entry.getValue().equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())) {
                this.powerConsumption = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString())) {
                this.filterType = entry.getValue().toString();
            } else if (entry.getValue().equals(SearchCriteria.VacuumCleaner.BAG_TYPE.toString())) {
                this.bagType = entry.getValue().toString();
            } else if (entry.getValue().equals(SearchCriteria.VacuumCleaner.WAND_TYPE.toString())) {
                this.wandType = entry.getValue().toString();
            } else if (entry.getValue().equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())) {
                this.motorSpeedRegulation = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())) {
                this.cleaningWidth = new Double(entry.getValue().toString());
            }
        }
    }


    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
}
