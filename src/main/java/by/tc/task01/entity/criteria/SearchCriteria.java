package by.tc.task01.entity.criteria;

import java.util.ArrayList;
import java.util.List;

public final class SearchCriteria {
	
	public static enum Oven{
		POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
	}
	
	public static enum Laptop{
		BATTERY_CAPACITY, OS, MEMORY_RAM, MEMORY_ROM, CPU, DISPLAY_INCHES
	}
	
	public static enum Refrigerator{
		POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, DEPTH, HEIGHT, WIDTH
	}
	
	public static enum VacuumCleaner{
		POWER_CONSUMPTION, CAPACITY, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
	}
	
	public static enum TabletPC{
		BATTERY_CAPACITY, OS, DISPLAY_INCHES, MEMORY_RAM, FLASH_MEMORY_CAPACITY, COLOR
	}
	
	public static enum Speakers{
		POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
	}

	public static List<String> getEnumFieldsNames() {
		List<String> resultList = new ArrayList<>();
		for(Oven name : Oven.values()) {
			resultList.add(name.name());
		}
		for(Laptop name : Laptop.values()) {
			resultList.add(name.name());
		}
		for(Refrigerator name : Refrigerator.values()) {
			resultList.add(name.name());
		}
		for(VacuumCleaner name : VacuumCleaner.values()) {
			resultList.add(name.name());
		}
		for(TabletPC name : TabletPC.values()) {
			resultList.add(name.name());
		}
		for(Speakers name : Speakers.values()) {
			resultList.add(name.name());
		}
		return resultList;
	}
	
	private SearchCriteria() {}
}

