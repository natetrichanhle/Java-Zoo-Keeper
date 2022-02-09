package com.nate.zookeeper;

public class Bat extends Mammal{
	public Bat() {
		// TODO Auto-generated constructor stub
		super.setEnergyLevel(300);
	}

	public void fly() {
		System.out.println("WEEEEE!");
		super.setEnergyLevel(-50);
	}
	
	public void eatHumans() {
		System.out.println("NOMNOMNOM!");
		super.setEnergyLevel(+25);
	}
	
	public void attackTown() {
		System.out.println("AHHHHH!");
		super.setEnergyLevel(-100);
	}
}
