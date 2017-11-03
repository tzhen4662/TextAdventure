package game;

import rooms.Room;
import person.Person;

import java.util.Scanner;

public class School {
	private Room[][]map;
	
	public School(Room[][] map) {
		this.map = map;
	}

	public void printMap(Person player1) {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if (j == player1.getX() && i == player1.getY())
				{
					System.out.print(" [ " + "  P  " + " ] ");
				}
				else
					System.out.print(" [ " + "Empty" + " ] ");
			}
			System.out.println(" ");
		} 

	}

}
