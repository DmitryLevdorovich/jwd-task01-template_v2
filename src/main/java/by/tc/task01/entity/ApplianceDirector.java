package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.impl.*;

import java.util.HashMap;
import java.util.Map;

public class ApplianceDirector {

    private final String builderType;
    private Map<String, ApplianceBuilder> buildersMap;

    public ApplianceDirector(String builderType) {

        this.builderType = builderType;
        this.buildersMap = new HashMap<>();
        this.buildersMap.put(SearchCriteria.Oven.class.getSimpleName(), new OvenBuilder());
        this.buildersMap.put(SearchCriteria.Laptop.class.getSimpleName(), new LaptopBuilder());
        this.buildersMap.put(SearchCriteria.Refrigerator.class.getSimpleName(), new RefrigeratorBuilder());
        this.buildersMap.put(SearchCriteria.Speakers.class.getSimpleName(), new SpeakersBuilder());
        this.buildersMap.put(SearchCriteria.TabletPC.class.getSimpleName(), new TabletPCBuilder());
        this.buildersMap.put(SearchCriteria.VacuumCleaner.class.getSimpleName(), new VacuumCleanerBuilder());
    }

    public Appliance createAppliance(String[] params) {

        return buildersMap.get(builderType).build(params);
    }
}
