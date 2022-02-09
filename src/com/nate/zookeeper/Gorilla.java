package com.nate.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("GORILLA THROW!");
		super.setEnergyLevel(-5);
	}
	
	public void eatBanana() {
		System.out.println("GORILLA EAT! YUM :)");
		super.setEnergyLevel(+10);
	}
	
	public void climb() {
		System.out.println("GORILLA GO UP TREE!");
		super.setEnergyLevel(-10);
	}
}
