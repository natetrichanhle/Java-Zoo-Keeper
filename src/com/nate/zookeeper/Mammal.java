package com.nate.zookeeper;

public class Mammal {
	private int energyLevel = 0;

	public Mammal(){
	}
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + getEnergyLevel());
		return getEnergyLevel();
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
