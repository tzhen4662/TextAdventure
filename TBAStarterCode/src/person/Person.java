package person;

import person.Person;
import rooms.Room;

public abstract class Person {
	private String name;
	private int age;
	private String ethnicity;
	private String gender;
	
	public Person(String name, int age, String gender, String ethnicity)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ethnicity = ethnicity;
	}
	
	public String getName()
	{
		return name;
	}
	
	public char[] print() {
		// TODO Auto-generated method stub
		return null;
	}

	public void printRoom() {
		// TODO Auto-generated method stub
	}

	public void setRoom(Room room) {
		// TODO Auto-generated method stub
		
	}

	public String chooseMove() {
		// TODO Auto-generated method stub
		return null;
	}

}
