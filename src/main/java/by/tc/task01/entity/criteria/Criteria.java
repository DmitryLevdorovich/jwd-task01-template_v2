package by.tc.task01.entity.criteria;

import java.util.*;

public class Criteria {

	private String groupSearchName;
	private Map<String, String> criteria = new HashMap<>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		if(searchCriteria.isEmpty()) {
			throw new RuntimeException("empty criteria");
		} else {
			criteria.put(searchCriteria, value.toString());
		}
	}
	
	public Map<String, String> getCriteria() { return this.criteria; }

	public List<String> getCriteriaStrings() {
		List<String> strings = new ArrayList<>();
		for (Map.Entry<String, String> entry : this.getCriteria().entrySet()) {
			strings.add(entry.getKey() + "=" + entry.getValue());
		}
		return strings;
	}

	public List<String> getSearchCriteriaStrings() {
		List<String> strings = new ArrayList<>();
		for (Map.Entry<String, String> entry : this.getCriteria().entrySet()) {
			strings.add(entry.getKey());
		}
		return strings;
	}

}
