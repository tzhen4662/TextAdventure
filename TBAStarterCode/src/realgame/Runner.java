package realgame;

import person.Person;
import java.util.Scanner;
/*
 * @author Tim Zhen and Zilong Yuen
 */
public class Runner {
	public static void main (String[] args)
	{
		String[][] rooms = new String[3][3];
		rooms[0][0] = "UserT";
		rooms[0][1] = "Zombi";
		rooms[0][2] = "Empty";
		rooms[1][0] = "Empty";
		rooms[1][1] = "Empty";
		rooms[1][2] = "Empty";
		rooms[2][0] = "Empty";
		rooms[2][1] = "Empty";
		rooms[2][2] = "Empty";
		int currentPosX = 0;
		int currentPosY = 0;
		int x = 3;
		int y = 3;
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				System.out.print(" [ " + rooms[i][j] + " ] ");
			}
			System.out.println("");
		}
		System.out.println("Which direction would you like to move?");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		if (response.equals("up") || response.equals("left") || response.equals("right") || response.equals("down"))
			System.out.println("no");
		else
			System.out.println("you cant do that");
			Runner.main(args);
	}
}
