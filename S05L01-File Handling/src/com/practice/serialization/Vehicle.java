package com.practice.serialization;

import java.io.Serializable;

public class Vehicle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1218926923738783438L;			//Identification for class
	public int vehicleId;
	public String name;
	public int getVehicleId() {
		return vehicleId;
	}
	public String getName() {
		return name;
	}
	public Vehicle(int vehicleId, String name) {
		super();
		this.vehicleId = vehicleId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", name=" + name + "]";
	}
}
