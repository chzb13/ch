package com.cn.ch.za.ch.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	public List<Person> meetCriteria(List<Person> list) {
		List <Person> listAdd = new ArrayList<Person>();
		for (Person person : list) {
			if("male".equalsIgnoreCase(person.getGender())){
				listAdd.add(person);
			}
		}
		return listAdd;
	}

}
