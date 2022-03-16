package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO{

	public static final String file = "appliances_db.txt";

	@Override
	public List<Appliance> find(Criteria criteria) {
		String dbFile = Objects.requireNonNull(getClass().getClassLoader().getResource(file)).getPath();
		List<Appliance> searchResultList = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(dbFile))) {
			String line = reader.readLine();
			while(line != null) {
				String[] parsedLineArray = parseLine(line);
				if(criteria.getGroupSearchName().equals(parsedLineArray[0]) || criteria.getGroupSearchName().isEmpty()) {

					List<String> dbKeyValueStrings = parseKeyValueStringsFromLine(parsedLineArray[1]);
					List<String> criteriaStrings = criteria.getCriteriaStrings();
					if (dbKeyValueStrings.containsAll(criteriaStrings)) {
						ApplianceDirector director = new ApplianceDirector(parsedLineArray[0]);

						searchResultList.add(director.createAppliance(parseValuesFromDbList(dbKeyValueStrings)));
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
		return line.split("(\\s:\\s)");
	}

	private List<String> parseKeyValueStringsFromLine(String line) {
		return Arrays.asList(line.split("(,\\s)"));
	}

	private String[] parseValuesFromDbList(List<String> dbList) {
		ArrayList<String> resultList = new ArrayList<>();
		for(String element : dbList) {
			resultList.add(element.split("(=)")[1]);
		}
		return resultList.toArray(new String[0]);
	}

}