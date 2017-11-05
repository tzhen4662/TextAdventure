package game;

import person.Person;
import java.util.Scanner;
/*
 * @authors:Tim Zhen and Zilong Yuen
 */
public class Utilities {

	public static Person createPerson() {
		System.out.println("What is your name?");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println("What is your age?");
		String age = in.nextLine();
		System.out.println("What's your gender?");
		String gender = in.nextLine();
		return new Person (response, age, gender, 0, 0);
	}


}
