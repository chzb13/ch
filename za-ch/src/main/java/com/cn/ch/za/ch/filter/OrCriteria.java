package com.cn.ch.za.ch.filter;

import java.util.List;

public class OrCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	public List<Person> meetCriteria(List<Person> list) {
		List<Person> meetCriteria = criteria.meetCriteria(list);
		List<Person> meetCriteria2 = otherCriteria.meetCriteria(list);
		for (Person person : meetCriteria2) {
			if(!meetCriteria.contains(meetCriteria2)){
				meetCriteria.add(person);
			}
		}
		return meetCriteria;
	}

}
