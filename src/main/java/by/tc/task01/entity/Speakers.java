package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Speakers implements Appliance, Serializable {

    private static final long serialVersionUID = 1199041970862591913L;

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

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.powerConsumption, powerConsumption) == 0 &&
                numberOfSpeakers == speakers.numberOfSpeakers &&
                Double.compare(speakers.cordLength, cordLength) == 0 &&
                Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    public String toString() {
        String className = this.getClass().getSimpleName();
        String[] values = getValues();
        SearchCriteria.Speakers[] names = SearchCriteria.Speakers.values();
        StringBuilder result = new StringBuilder(className + " : ");
        for(int i = 0; i < names.length; i++) {
            result.append(names[i]).append("=").append(values[i]).append(" ");
        }
        return result.toString();
    }

    private String[] getValues() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add(Double.toString(getPowerConsumption()));
        strings.add(Double.toString(getNumberOfSpeakers()));
        strings.add(getFrequencyRange());
        strings.add(Double.toString(getCordLength()));
        return strings.toArray(new String[0]);
    }
}
