

import java.util.ArrayList;


public class Player {
	
	private String name;
	private Room position;
	private ArrayList<Item> inventory =  new ArrayList<Item>();
	private boolean isAlive;
	private int money;
	
	
	
	public Player(String name){
		this.name = name;
		isAlive = true;
		System.out.println("Player created with name: " + name);
		
	}
	
	public void giveItem(Item item){
		inventory.add(item);
	}
	
	public boolean isAlive(){
		return isAlive;
	}
	
	public Room getPosition(){
		return position;
	}

	public void setPosition(Room position){
		this.position = position;
		
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<Item> getInventory(){
		return inventory;
	}
	
	public void setInventory(ArrayList<Item> inventory){
		this.inventory = inventory;		
	}
	
	public int getMoney(){
		return money;
	}
	
	public void giveMoney(int cash){
		money += cash;
	}
	
	public boolean has (String itemName){
		for (Item i : inventory){
			if (i.getName().equals(itemName)){
				return true;
				
			}
			
				
			
		}
		return false;
			
		
	}
	
	
}