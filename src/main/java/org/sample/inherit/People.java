package org.sample.inherit;

public class People {

	private String name;
	private int age;
	private static String country;

	public People() {}
	public People(String name, int age/*, String country*/) {
		setName(name);
		setAge(age);
	}
	
	// 2.�ṩ���е�get��set���������ڷ������н��к���ֵ���ж�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0 && age < 150) {
			this.age = age;
		} else {
			System.out.println("Not a valid age!");
		}
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		//this.country = country;
		People.country = country;
	}
	
	public void show() {
		System.out.println("I am " + getName() + ", and my age is " + getAge() + ", come from " + getCountry());
	}
}