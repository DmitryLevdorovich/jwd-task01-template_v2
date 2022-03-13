package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.lang.reflect.Field;
import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliance) {
		for (Appliance appliance1 : appliance) {
			System.out.println(appliance1.getClass().getSimpleName() + " : ");
			Field[] fields = appliance1.getClass().getFields();
			for(Field field : fields) {
				field.setAccessible(true);
				try {
					System.out.print(field.getName() + "=" + field.get(appliance1) + "; ");
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// you may add your own code here

}
