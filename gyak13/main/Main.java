package main;

import game.Player;
import game.vehicle.Car;
import game.utils.VehicleException;
import java.io.*;


public class Main {


	public static Player loadPlayerFromFile(String playerName){
		File input = new File("users/" + playerName + ".txt");

		String[] data = null;
		try (BufferedReader bf = new BufferedReader(new FileReader(input))){
			String line = bf.readLine();
			data = line.split(" ");

			return new Player(playerName, data[0], Integer.parseInt(data[1]));
		} catch (IOException e) {
			System.out.println("IO error occured: " + e.getMessage());
		} catch(NumberFormatException e) {
			return new Player(playerName, data[0], 0);
		}

		return null;
	}


	public static void main(String[] args) throws VehicleException{
		Player daniel = loadPlayerFromFile("Daniel");
		Player peter = loadPlayerFromFile("Peter");
		Player richard = loadPlayerFromFile("Richard");
		Player tamas = loadPlayerFromFile("Tamas");
		Player zorror = loadPlayerFromFile("Zorror");
		
		Car car2 = new Car(200,10000);
		Car car1 = new Car(200,9000);
		Car car3 = new Car(150,5000);
		Car car4 = new Car(300,20000);
		Car car5 = new Car(300,22000);
		
		daniel.buyCar(car2);
		daniel.buyCar(car1);
		daniel.buyCar(car3);
		System.out.println(daniel.getSortedCars());
		
		

		
	}

}