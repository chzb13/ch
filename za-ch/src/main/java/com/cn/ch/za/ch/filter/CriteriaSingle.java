package com.cn.ch.za.ch.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

	public List<Person> meetCriteria(List<Person> list) {
		List <Person> listadd = new ArrayList<Person>();
		for (Person person : list) {
			if("single".equalsIgnoreCase(person.getMaritalStatus())){
				listadd.add(person);
			}
		}
		return listadd;
	}

}
