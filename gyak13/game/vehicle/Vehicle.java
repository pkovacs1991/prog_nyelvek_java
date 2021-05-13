package game.vehicle;

import game.utils.VehicleException;

public abstract class Vehicle {
	
	private static int currentId = 0;
	protected final int id;
	private double currentSpeed;
	
	public Vehicle() {
		this.id = currentId++;
	}
	
	
	protected final void accelerateCurrentSpeed(double amount) throws VehicleException{
		if(currentSpeed + amount < 0) {
			throw new VehicleException("currentSpeed:" + currentSpeed + " and amount " + amount + " less than 0");
		}
		currentSpeed+=amount;
	}
	
	public double getCurrentSpeed() {
		return currentSpeed; 
	}
	
	public abstract void accelerate(double amount) throws VehicleException;
}	