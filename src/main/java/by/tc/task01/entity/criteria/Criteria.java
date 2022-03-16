package by.tc.task01.entity.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value.toString());
	}
	
	public Map<String, Object> getCriteria() { return this.criteria; }

	public List<String> getCriteriaStrings() {
		List<String> strings = new ArrayList<>();
		for (Map.Entry entry : this.getCriteria().entrySet()) {
			strings.add(entry.getKey().toString() + "=" + entry.getValue().toString());
		}
		return strings;
	}

}
