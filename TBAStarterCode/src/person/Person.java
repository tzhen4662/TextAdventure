package person;

import java.util.Scanner;

import person.Person;
import rooms.Room;
/*
 * @authors:Tim Zhen and Zilong Yuen
 */
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
	
	public void chooseMove()
	{
		System.out.println("Which direction would you like to move?");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		if (response.equals("up"))
		{
			this.yCoord -= 1;
		}
		else if (response.equals("down"))
		{
			this.yCoord += 1;
		}
		else if (response.equals("right"))
		{
			this.xCoord += 1;
		}
		else if (response.equals("left"))	
		{
			this.xCoord -= 1 ;
		}
		else
		{
			System.out.println("You cant do that!");
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
