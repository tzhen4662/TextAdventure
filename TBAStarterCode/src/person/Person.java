package person;

import person.Person;

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
	
	//public int setRoom
}
