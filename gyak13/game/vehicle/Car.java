package game.vehicle;

import game.utils.VehicleException;
import game.Player;

public class Car extends Vehicle implements Comparable<Car> {
	
	private final int maxSpeed;
	private final int price;
	private Player owner;
	public Car(int maxSpeed, int price) {
		this.maxSpeed = maxSpeed;
		this.price = price;
		this.owner = null;
	}

	public int getPrice() {
		return this.price;
	}

	public String toString() {
		return this.id + ": max Speed: " + maxSpeed + " price: " + price;
	}
	
	public Player getOwner() {
		return this.owner;
	}
	
	public void setOwner(Player player) {
		this.owner = player;
	}

	@Override
	public void accelerate(double amount) throws VehicleException{
		if(this.getCurrentSpeed() + amount <= maxSpeed) {
			super.accelerateCurrentSpeed(amount );
		} 
		
	}
	
	@Override
	public int compareTo(Car that) {
		int compareResult = Integer.compare(this.maxSpeed, that.maxSpeed);
		if(compareResult == 0 ) {
			return Integer.compare(this.price, that.price);
			
		} else {
			return compareResult;
		}
	}

}