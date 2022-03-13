package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class Speakers extends Appliance{

    private double powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers(double powerConsumption, int numberOfSpeakers,
                    String frequencyRange, double cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public Speakers(Map<String, Object> keyValueSet) {
        for (Map.Entry entry : keyValueSet.entrySet()) {
            if (entry.getValue().equals(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
                this.powerConsumption = new Double(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
                this.numberOfSpeakers = new Integer(entry.getValue().toString());
            } else if (entry.getValue().equals(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
                this.frequencyRange = entry.getValue().toString();
            } else if (entry.getValue().equals(SearchCriteria.Speakers.CORD_LENGTH.toString())) {
                this.cordLength = new Double(entry.getValue().toString());
            }
        }
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }
}
