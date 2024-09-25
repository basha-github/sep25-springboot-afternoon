package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private String name;
	private String course;
	private int fee;
	private int java;
	private int cpp;
	private int python;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPython() {
		return python;
	}
	public void setPython(int python) {
		this.python = python;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getCpp() {
		return cpp;
	}
	public void setCpp(int cpp) {
		this.cpp = cpp;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
