package person;

import java.util.Scanner;

import person.Person;
import realgame.Runner;
import rooms.Room;

public class Person {
	private String name;
	private String age;
	private String gender;
	private Room room;
	
	public Person(String name, String age, String gender)
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
			return "no";
		}
	}

	public void printRoom() {
		System.out.println("You are currently in a safe room.");
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public char[] print() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
