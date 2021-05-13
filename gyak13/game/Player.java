package game;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;
import game.vehicle.Car;
import game.utils.VehicleException;
public class Player {

	private String name;
	private String ipAddress;
	private int money;
	private ArrayList<Car> cars;
	
	public Player(String name, String ipAddress, int money) {
		if(name == null || ipAddress == null || ipAddress.length() <= 0 || money < 0) {
			throw new IllegalArgumentException();
		}			
		
		//if(ipAddress.contains(" "))
		for(int i = 0; i < ipAddress.length(); i++) {
			if(Character.isWhitespace(ipAddress.charAt(i))){
				throw new IllegalArgumentException();
			}
		}
		
		this.name = name;
		this.ipAddress = ipAddress;
		this.money = money;
		this.cars = new ArrayList<>();
		
	}
	
	public int getMoney() {
		return money;
		
	}
	
	public void buyCar(Car car) throws VehicleException {
		if(car.getPrice() > this.money) {
			throw new VehicleException("You dont have enough money to buy this car");
		}
		
		if(car.getOwner() != null) {
			throw new VehicleException("You cannot buy this car because some already bought it");
		}
		car.setOwner(this);
		this.cars.add(car);
		this.money -=car.getPrice();
	}
	
	
	public ArrayList<Car> getSortedCars() {
		ArrayList<Car> sortedCars = new ArrayList<>(cars);
		Collections.sort(sortedCars);
		return sortedCars;
	}
	
	@Override
	public boolean equals(Object that) {
		if(that == null) return false;
		if(this == that) return true;
		
		if(that instanceof Player) {
			Player thatPlayer = (Player) that;
			return this.name.equals(thatPlayer.name) && this.money == thatPlayer.money && this.cars.equals(thatPlayer.cars);
		}
		return false;
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(money, name, cars);
	}

}