package com.javaex.ex04;

public class User {
	protected String id;
	protected String password;
	protected String name;
	
	public User() {
		
	}
	public User(String i, String p, String n) {
		this.id = i;
		this.password = p;
		this.name = n;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.print("#아이디" + id);
		System.out.print(", #패스워드" + password);
		System.out.println(", #이름" + name);
	}
	
}
