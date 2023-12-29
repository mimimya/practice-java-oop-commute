package dev.syntax.oop.step00example;

public class Bus extends Vehicle {
	final static String name = "버스";

	public Bus(String name, int number, int pee) {
		super(number, pee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return name + " " + super.toString();
	}

}
