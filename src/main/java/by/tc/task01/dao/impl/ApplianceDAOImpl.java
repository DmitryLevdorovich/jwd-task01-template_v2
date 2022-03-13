package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.*;

import static by.tc.task01.entity.Appliance.createAppliance;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public List<Appliance> find(Criteria criteria) {
		String dbFile = Objects.requireNonNull(getClass().getClassLoader().getResource("appliances_db.txt")).getPath();
		List<Appliance> searchResultList = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(dbFile))) {
			String line = reader.readLine();
			while(line != null) {
				String[] parsedLineArray = parseLine(line);
				if(criteria.getGroupSearchName().equals(parsedLineArray[0])) {
					Map<String, Object> dbLineMap = parseMapFromLine(parsedLineArray[1]);
					Map<String, Object> criteriaMap = criteria.getCriteria();
					if (dbLineMap.entrySet().containsAll(criteriaMap.entrySet())) {
						searchResultList.add(createAppliance(parsedLineArray[0], dbLineMap));
					}
				}
				line = reader.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return searchResultList;
	}

	private String[] parseLine(String line) {
		String[] stringList = line.split("(\\s:\\s)");
		return stringList;
	}

	private Map<String, Object> parseMapFromLine(String line) {
		Map<String, Object> resultMap = new HashMap<>();
		String[] strings = line.split("(,\\s)");
		for(String string : strings) {
			String[] nameValueArray = string.split("(=)");
			resultMap.put(nameValueArray[0], nameValueArray[1]);
		}
		return resultMap;
	}

}


//you may add your own new classes