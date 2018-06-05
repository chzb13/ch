package com.cn.ch.za.ch.filter;

import java.util.List;

public class AndCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}


	public List<Person> meetCriteria(List<Person> list) {
		List<Person> meetCriteria = criteria.meetCriteria(list);
		List<Person> list2 = otherCriteria.meetCriteria(meetCriteria);
		return list2;
	}

}
