package game;

import rooms.Room;
import person.Person;
import rooms.Hallway;

/*
 * @authors:Tim Zhen and Zilong Yuen
 */
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
				else if (j == 3 && i == 3)
				{
					System.out.print(" [ " + "Zombi" + " ] ");
				}
				else if (j == 1 && i == 1)
				{
					System.out.print(" [ " + "Zombi" + " ] ");
				}
				else if (j == 1 && i == 3)
				{
					System.out.print(" [ " + "Zombi" + " ] ");
				}
				else if (j == 2 && i == 1)
				{
					System.out.print(" [ " + "Zombi" + " ] ");
				}
				else
					System.out.print(" [ " + "Empty" + " ] ");
			}
			System.out.println(" ");
		} 

	}

}
