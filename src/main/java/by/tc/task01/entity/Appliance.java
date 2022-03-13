package by.tc.task01.entity;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Appliance {
	// you may add your own code here
    public Appliance() {

    }

    public static Appliance createAppliance(String groupName, Map<String, Object> keyValueMap) {
        if (groupName.equals(Laptop.class.getName())) {
            return new Laptop(keyValueMap);
        } else if (groupName.equals(Oven.class.getName())) {
            return new Oven(keyValueMap);
        } else if (groupName.equals(Refrigerator.class.getName())) {
            return new Refrigerator(keyValueMap);
        } else if (groupName.equals(Speakers.class.getName())) {
            return new Speakers(keyValueMap);
        } else if (groupName.equals(TabletPC.class.getName())) {
            return new TabletPC(keyValueMap);
        } else if (groupName.equals(VacuumCleaner.class.getName())) {
            return new VacuumCleaner(keyValueMap);
        } else {
            return new Appliance();
        }
    }
}
