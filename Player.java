import java.util.ArrayList;

public class Player {
	
	private static String name;
	private Room position;
	private ArrayList inventory;
	private boolean isAlive;
	
	
	
	public Player(String name){
		this.name = name;
		isAlive = true;
		System.out.println("Player created with name: " + name);
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
	
	public static String getName(){
		return name;
	}
	
	public ArrayList getInventory(){
		return inventory;
	}
	
	public void setInventory(ArrayList inventory){
		this.inventory = inventory;		
	}
}