package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import game.Player;
import game.vehicle.Car;
import game.utils.VehicleException;


public class Tests {

	public static final double EPSILON = 0.01;


	@Test(expected = IllegalArgumentException.class)
	public void testPlayerNameNull() {
		
		new Player(null, "192.168.0.1" ,10);
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPlayerMoneyNegative() {
		
		new Player("player", "192.168.0.1" , -10);
		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testPlayerIpContainsWhiteSpace() {
		
		new Player("player", "192 168 0 1" , 10);
		
	}
	
	@Test()
	public void testPlayerMoney() {
		
		Player player = new Player("player", "192.168.0.1" , 10);
		assertEquals(10, player.getMoney());
	}
	
	
	@Test
	public void testCarAccelerate() throws VehicleException{
		Car car = new Car(300, 6000);
		assertEquals(0, car.getCurrentSpeed(), EPSILON);
		car.accelerate(50);
		assertEquals(50, car.getCurrentSpeed(), EPSILON);
		car.accelerate(-30);
		assertEquals(20, car.getCurrentSpeed(), EPSILON);
	}
	
	@Test
	public void testCarAccelerateGreateThanMaxSpeed() throws VehicleException{
		Car car = new Car(300, 6000);
		assertEquals(0, car.getCurrentSpeed(), EPSILON);
		car.accelerate(320);
		assertEquals(0, car.getCurrentSpeed(), EPSILON);
		
	}
	
	@Test(expected = VehicleException.class)
	public void testCarAccelerateLessThanZero() throws VehicleException{
		Car car = new Car(300, 6000);
		assertEquals(0, car.getCurrentSpeed(), EPSILON);
		car.accelerate(-20);
		
		
	}
	
	
	@Test
	public void testPlayerEqualsNotSameIP() {
		Player p1 = new Player("player", "192.168.0.1", 100);
		Player p2 = new Player("player", "192.168.1.1", 100);
		assertTrue(p1.equals(p2));
	}
	
	@Test
	public void testPlayerEquaSameHashCode() {
		Player p1 = new Player("player", "192.168.0.1", 100);
		Player p2 = new Player("player", "192.168.1.1", 100);
		assertTrue(p1.hashCode() == p2.hashCode());
	}


	@Test
	public void testCarCompareToTransitive() {
		Car car1 = new Car(200, 100);
		Car car2 = new Car(250, 300);
		Car car3 = new Car(250, 400);
		assertTrue(0 > car1.compareTo(car2));
		assertTrue(0 > car2.compareTo(car3));
		assertTrue(0 > car1.compareTo(car3));
		
	}

	@Test(expected = VehicleException.class)
	public void testPlayerBuyCarNotEnoughMoney() throws VehicleException{
		Player p1 = new Player("player", "192.168.0.1", 100);
		Car car = new Car(300, 6000);
		p1.buyCar(car);
		
		
	}
	
	@Test(expected = VehicleException.class)
	public void testPlayerBuyCarHasOwner() throws VehicleException{
		Player p1 = new Player("player", "192.168.0.1", 7000);
		Player p2 = new Player("player", "192.168.0.1", 7000);
		Car car = new Car(300, 6000);
		p1.buyCar(car);
		p2.buyCar(car);
		
		
	}

}