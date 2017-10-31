package person;

import java.util.Scanner;

import person.Person;
import realgame.Runner;
import rooms.Room;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String chooseMove()
	{
		System.out.println("Which direction would you like to move?");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		if (response.equals("up"))
		{
			return "up";
		}
		else if (response.equals("down"))
		{
			return "down";
		}
		else if (response.equals("right"))
		{
			return "right";
		}
		else if (response.equals("left"))	
		{
			return "left";
		}
		else
		{
			System.out.println("you cant do that");

		}
	}

	public void printRoom() {
		for ()
	}

	public void setRoom(Room room) {
		this.room = room;
		
	}

	public char[] print() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
