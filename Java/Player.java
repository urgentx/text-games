
import java.util.Hashtable;
import java.util.ArrayList;


public class Player {
	
	private String name;
	private Room position;
	private Hashtable<String, Item> inventory =  new Hashtable<String, Item>();
	private boolean isAlive;
	private int money;
	
	
	
	public Player(String name){
		this.name = name;
		isAlive = true;		
	}
	
	public void giveItem(Item item){		
		inventory.put(item.getName(), item);
	}
	
	public void takeItem(String itemName){
		inventory.remove(itemName);
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
	
	public Hashtable<String, Item> getInventory(){
		return inventory;
	}
	
	public void setInventory(Hashtable<String, Item> inventory){
		this.inventory = inventory;		
	}
	
	public int getMoney(){
		return money;
	}
	
	public void giveMoney(int cash){
		money += cash;
	}
	
	public boolean has (String itemName){
			if(inventory.contains(itemName)){
				return true;
			} else {
				return false;
			}
	}
	
	
}