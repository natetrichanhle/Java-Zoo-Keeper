package com.nate.zookeeper;

public class Bat extends Mammal{
	public Bat() {
		// TODO Auto-generated constructor stub
		this.setEnergyLevel(300);
	}

	public void fly() {
		System.out.println("WEEEEE!");
		this.setEnergyLevel(-50);
	}
	
	public void eatHumans() {
		System.out.println("NOMNOMNOM!");
		this.setEnergyLevel(+25);
	}
	
	public void attackTown() {
		System.out.println("AHHHHH!");
		this.setEnergyLevel(-100);
	}
}
