//Program to demonstrate encapsulation

package com.tnsif.encapsulation;

public class Encapsulation {

	 private int serialnum=10;// Data members
	 private String name;
	 private int age;
	
	public void show() // member function
	{
		serialnum++;
		System.out.println("serialnubetr"+serialnum +"\t Name:" +name +"\t Age:" +age);
	}

	public int getSerialnum() {
		return serialnum;
	}

	public void setSerialnum(int serialnum) {
		this.serialnum = serialnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	//string reprsentation of the object
	public String toString() {
		return "Encapsulation [serialnum=" + serialnum + ", name=" + name + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}