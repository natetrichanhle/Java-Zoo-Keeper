package com.nate.zookeeper;

public class Gorilla extends Mammal {
	public Gorilla() {
	}
	
	public void throwSomething() {
		System.out.println("GORILLA THROW!");
		this.setEnergyLevel(-5);
	}
	
	public void eatBanana() {
		System.out.println("GORILLA EAT! YUM :)");
		this.setEnergyLevel(+10);
	}
	
	public void climb() {
		System.out.println("GORILLA GO UP TREE!");
		this.setEnergyLevel(-10);
	}
}
