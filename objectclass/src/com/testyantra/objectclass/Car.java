package com.testyantra.objectclass;

public class Car {
	int id;
	String brand;
	String color;
	
	
	
	public Car(int id, String brand, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", color=" + color + "]";
	}
	
	
}
