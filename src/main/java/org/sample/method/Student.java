package org.sample.method;

public class Student {
	//use private
	private int id;
	private String name;

	public Student() {}
	public Student(int id, String name) {
		setId(id);
		setName(name);
	}
	
	//getter setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id > 0) {
			this.id = id;
		} else {
			System.out.println("Not a valid id!");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("I am " + getName() + ", my id is: " + getId());
	}
}