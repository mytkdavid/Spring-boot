package com.example.demomysql.bean;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "User")
public class User {
	
	private int id;
    private String name;
    private int age;
    private double money;
    
	public User(int id, String name, int age, double money) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.money = money;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		this.age = age;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
    
	   

}

