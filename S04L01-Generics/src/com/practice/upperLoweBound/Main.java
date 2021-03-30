package com.practice.upperLoweBound;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int vehicleId;

	public Vehicle(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}
	
	void getIfo() {
		System.out.println("Vehicle Id :"+getVehicleId());
	}
	
}
class Car extends Vehicle{

	private String carModel;

	public String getCarModel() {
		return carModel;
	}

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}
	@Override
	void getIfo() {
		System.out.println("Vehicle Id :"+getVehicleId());
	}

}
public class Main {

	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(20));
		list.add(new Vehicle(30));
		list.add(new Vehicle(40));
		list.add(new Car(50,"Moedel0"));
		
		Main.displayList1(list);
		System.out.println();
		Main.displayList2(list);
	}
	public static void displayList1(List<? extends Vehicle> list) {			//UpperBound
		for(Vehicle element:list) {
			element.getIfo();
		}
	}
	public static void displayList2(List<? super Car> list) {				//LowerBound
		for(Object element:list) {
			System.out.println(element);				//Having restriction on lower bound that can not called method inside class
		}
	}
}
