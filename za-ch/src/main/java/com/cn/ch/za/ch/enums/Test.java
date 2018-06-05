package com.cn.ch.za.ch.enums;

public class Test implements Cloneable{
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test);
		try {
			System.out.println((Test)test.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
