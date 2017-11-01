package game;

import rooms.Room;

public class School {
	private Room[][]map;
	
	public School(Room[][] map) {
		this.map = map;
	}

	public void printMap() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.print(" [ " + " "+ " ] ");
			}
			System.out.println("");
		}
	}

}
