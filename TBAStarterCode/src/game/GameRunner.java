package game;

import rooms.*;
import person.Person;

import java.util.Scanner;
/*
 * @authors:Tim Zhen and Zilong Yuen
 */
public class GameRunner {

    public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        for (int j = 0; j<map.length; j++)
        {
        	Room[] row = map[j];
            for (int i = 0; i<row.length;i++)
            {
                boolean[] doors = {true,true,true,true};
                Person[] people = {};

                row[i] = new Hallway(doors, people, i, j);
            }

        }

        School tech = new School(map);


        boolean gameOn = true;
        Person player1 = Utilities.createPerson();
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Welcome to the ZombiLand, " + player1.getName() + ", you must navigate your way around the zombies in ZombiLand." 
            + " If you bump into a zombie you're dead." + " Good Luck!");
            //map[0][0].addOccupant(player1);

            tech.printMap(player1);
            player1.printRoom();
            player1.chooseMove();
            //Utilities.movePlayer(tech, player1,move);
            if(player1.getY() > 5 || player1.getY() < 0 || player1.getX() > 5 || player1.getX() < 0)
			{
            	System.out.print("omae wa mou shindeiru");
				gameOn = false;
			}
        }
		in.close();
    }

}



