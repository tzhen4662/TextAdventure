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
		for (int i = 0; i < 7; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				if (j == player1.getX() && i == player1.getY())
				{
					System.out.print(" [ " + "  P  " + " ] ");
				}
				else if (j == 3 && i == 3)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else if (j == 1 && i == 1)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else if (j == 1 && i == 3)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else if (j == 2 && i == 1)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else if (j == 4 && i == 0)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else if (j == 0 && i == 3)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else if (j == 5 && i == 2)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else if (j == 6 && i == 2)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else if (j == 5 && i == 5)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else if (j == 1 && i == 5)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else if (j == 0 && i == 5)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else if (j == 3 && i == 5)
				{
					System.out.print(" [ " + "  M  " + " ] ");
				}
				else
					System.out.print(" [ " + "Empty" + " ] ");
			}
			System.out.println(" ");
		} 

	}

}
