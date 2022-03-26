package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.List;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {

		List<String> criteriaList = criteria.getSearchCriteriaStrings();
		List<String> enumNamesList = SearchCriteria.getEnumFieldsNames();

		return enumNamesList.containsAll(criteriaList);
	}

}