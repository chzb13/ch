package com.cn.ch.za.ch.enums;
/**
 * 枚举实现单例
 * @author chenhao
 *
 */
public class EnumSingleton {

	private EnumSingleton(){}
	
	public static EnumSingleton getInstance(){
		return Singleton.INSTANCE.getSingleTon();
	}
	
	private static enum Singleton{
		INSTANCE;
		
		private EnumSingleton instance;
		
		 //JVM会保证此方法绝对只调用一次 本身就是 private
		private Singleton(){
			instance = new EnumSingleton();
		}
		
		public EnumSingleton getSingleTon(){
			return instance;
		}
	}
	
	public static void main(String[] args) {
		EnumSingleton obj1 = getInstance();
		EnumSingleton obj2 = getInstance();
		System.out.println("obj1==obj2?" + (obj1==obj2));
	}
}
