package com.example.demo;

class DataObject{
	private int id;
	private String name;
	private String value;

	public DataObject(int id,String name,String value) {
		super();
		this.setId(id);
		this.setName(name);
		this.setValue(value);
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}


}   