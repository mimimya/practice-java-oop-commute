package dev.syntax.oop.step00example;

public class Student {
	private String name;
	private int nowMoney;
	public Student(String name, int nowMoney) {
		super();
		this.name = name;
		this.nowMoney = nowMoney;
	}
	
	public void rideVehicle(Vehicle vehicle) {
		if(this.nowMoney>=vehicle.getPee()) {
			this.nowMoney -= vehicle.getPee();
			vehicle.ridePeople();
		}else {
			System.out.println("돈이 없어서 못타요");
		}
	}
	
	public void getOffVehicle(Vehicle vehicle) {
		vehicle.getOffPeople();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", nowMoney=" + nowMoney + "]";
	}
	
}
