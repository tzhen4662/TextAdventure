package game;

import person.Person;

import java.util.Random;

public class Utilities {

	public static Person createPerson() {
		Random r = new Random();
		int x = r.nextInt(2);
		switch(x)
		{
			case 0:
				return new Person("Tim", 5, "Male");
			case 1:
				return new Person("Zilong", 6, "Female");
			default:
				return new Person("ZhenYuen", 24, "Female");
		}
	}

	public static void movePlayer(School tech, Person player1, String move) {
		
	}

}
