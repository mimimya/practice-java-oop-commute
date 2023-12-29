package dev.syntax.oop.step00example;

public class Subway extends Vehicle {
	final static String name = "지하철";

	public Subway(String name, int number, int pee) {
		super(number, pee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return name + " " + super.toString();
	}

}
