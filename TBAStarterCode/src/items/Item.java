package items;

import items.Item;

public abstract class Item {
	private String name;
	private int power;
	
	public Item (String name, int power)
	{
		this.name = name;
		this.power = power;
	}
}
