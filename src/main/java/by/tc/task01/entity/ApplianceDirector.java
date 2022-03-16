package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.impl.*;

public class ApplianceDirector {

    private String builderType;

    public ApplianceDirector(String builderType) {
        this.builderType = builderType;
    }

    public Appliance createAppliance(String[] params) {
        if(SearchCriteria.Oven.class.getSimpleName().equals(builderType)) {
            OvenBuilder builder = new OvenBuilder();
            return createOven(builder, params);
        } else if(SearchCriteria.Laptop.class.getSimpleName().equals(builderType)) {
            LaptopBuilder builder = new LaptopBuilder();
            return createLaptop(builder, params);
        } else if(SearchCriteria.Refrigerator.class.getSimpleName().equals(builderType)) {
            RefrigeratorBuilder builder = new RefrigeratorBuilder();
            return createRefrigerator(builder, params);
        } else if(SearchCriteria.Speakers.class.getSimpleName().equals(builderType)) {
            SpeakersBuilder builder = new SpeakersBuilder();
            return createSpeakers(builder, params);
        } else if(SearchCriteria.TabletPC.class.getSimpleName().equals(builderType)) {
            TabletPCBuilder builder = new TabletPCBuilder();
            return createTabletPC(builder, params);
        } else if(SearchCriteria.VacuumCleaner.class.getSimpleName().equals(builderType)) {
            VacuumCleanerBuilder builder = new VacuumCleanerBuilder();
            return createVacuumCleaner(builder, params);
        } else throw new RuntimeException("Create appliances from db failed.");
    }

    //parameters - String[] list of parameters
    private Laptop createLaptop(LaptopBuilder builder, String[] parameters) {
        builder.setPowerSupply(Double.parseDouble(parameters[0]));
        builder.setOS(parameters[1]);
        builder.setMemory(Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]));
        builder.setCPU(Double.parseDouble(parameters[4]));
        builder.setDisplaySize(Double.parseDouble(parameters[5]));
        return builder.getLaptop();
    }

    private Oven createOven(OvenBuilder builder, String[] parameters) {
        builder.setPowerSupply(Double.parseDouble(parameters[0]));
        builder.setWeight(Double.parseDouble(parameters[1]));
        builder.setCapacity(Double.parseDouble(parameters[2]));
        builder.setDimensions(Double.parseDouble(parameters[3]),
                Double.parseDouble(parameters[4]), Double.parseDouble(parameters[5]));
        return builder.getOven();
    }

    private Refrigerator createRefrigerator(RefrigeratorBuilder builder, String[] parameters) {
        builder.setPowerSupply(Double.parseDouble(parameters[0]));
        builder.setWeight(Double.parseDouble(parameters[1]));
        builder.setFreezerCapacity(Double.parseDouble(parameters[2]));
        builder.setCapacity(Double.parseDouble(parameters[3]));
        builder.setDimensions(Double.parseDouble(parameters[4]),
                Double.parseDouble(parameters[5]), Double.parseDouble(parameters[6]));
        return builder.getRefrigerator();
    }

    private Speakers createSpeakers(SpeakersBuilder builder, String[] parameters) {
        builder.setPowerSupply(Double.parseDouble(parameters[0]));
        builder.setSpeakersNumber(Integer.parseInt(parameters[1]));
        builder.setFrequencyRange(parameters[2]);
        builder.setLength(Double.parseDouble(parameters[3]));
        return builder.getSpeakers();
    }

    private TabletPC createTabletPC(TabletPCBuilder builder, String[] parameters) {
        builder.setPowerSupply(Double.parseDouble(parameters[0]));
        builder.setOS(parameters[1]);
        builder.setDisplaySize(Double.parseDouble(parameters[2]));
        builder.setMemory(Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]));
        builder.setColour(parameters[5]);
        return builder.getTabletPC();
    }

    private  VacuumCleaner createVacuumCleaner(VacuumCleanerBuilder builder, String[] parameters) {
        builder.setPowerSupply(Double.parseDouble(parameters[0]));
        builder.setCapacity(Double.parseDouble(parameters[1]));
        builder.setVCAccessories(parameters[2], parameters[3], parameters[4]);
        builder.setMotorSpeed(Double.parseDouble(parameters[5]));
        builder.setLength(Double.parseDouble(parameters[6]));
        return builder.getVacuumCleaner();
    }
}
