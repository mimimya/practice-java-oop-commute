package dev.syntax.oop.step00example;

public class Vehicle {
	private int number;
	private int pee;
	private int peopleNum;
	private int totalSum;
	
	public Vehicle(int number, int pee) {
		this.number = number;
		this.peopleNum = 0;
		this.totalSum = 0;
		this.pee = pee;
	}
	
	public void ridePeople() {
		this.totalSum += this.pee;
		this.peopleNum++;
	}
	
	
	public void getOffPeople() {
		this.peopleNum--;
	}
	
	public int getPee() {
		return this.pee;
	}

	@Override
	public String toString() {
		return "Vehicle [number=" + number + ", pee=" + pee + ", peopleNum=" + peopleNum
				+ ", totalSum=" + totalSum + "]";
	}
	
	

}
