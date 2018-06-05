package com.cn.ch.za.ch.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{

	public List<Person> meetCriteria(List<Person> list) {
		List<Person> listadd = new ArrayList<Person>();
		for (Person person : list) {
			if("Female".equalsIgnoreCase(person.getGender())){
				listadd.add(person);
			}
		}
		return listadd;
	}

}
