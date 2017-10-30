package game;

import rooms.Room;

public class School {
	private Room[][]map;
	
	public School(Room[][] map) {
		this.map = map;
	}

	public void printMap() {
		System.out.println(map);
		
	}

}
