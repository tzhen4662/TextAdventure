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
	private int xCoord;
	private int yCoord;
	
	
	public Person(String name, String age, String gender, int xCoord, int yCoord)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int chooseMove()
	{
		System.out.println("Which direction would you like to move?");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		if (response.equals("up"))
		{
			return yCoord - 1;
		}
		else if (response.equals("down"))
		{
			return yCoord + 1;
		}
		else if (response.equals("right"))
		{
			return xCoord + 1;
		}
		else if (response.equals("left"))	
		{
			return xCoord - 1 ;
		}
		else
		{
			System.out.println("You cant do that!");
			return 0;
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
	
	public int getX()
	{
		return xCoord;
	}
	
	public int getY()
	{
		return yCoord;
	}
}
