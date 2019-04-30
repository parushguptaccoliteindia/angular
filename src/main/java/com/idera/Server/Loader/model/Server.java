package com.idera.Server.Loader.model;

public class Server {

	Long id;
	String name;
	boolean activity;
	
	public Server() {
		
	}
	
	public Server(Long id, String name, boolean activity) {
		this.id=id;
		this.name=name;
		this.activity=activity;
	}
		
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActivity() {
		return activity;
	}
	public void setActivity(boolean activity) {
		this.activity = activity;
	}
	
	

	
}
