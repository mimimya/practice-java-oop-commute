package dev.syntax.oop.step00example;

public class Main {

	public static void main(String[] args) {
		Student kim = new Student("kim", 10000);
		
		Bus bus = new  Bus("Bus", 730, 1500);
		Subway subway = new Subway("Subway", 2,  1000);
		
		
		System.out.println(kim);
		System.out.println(bus);
		System.out.println(subway);
		
		kim.rideVehicle(bus);
		kim.rideVehicle(subway);
		kim.getOffVehicle(bus);
		
		System.out.println(kim);
		System.out.println(bus);
		System.out.println(subway);
		
	}

}
