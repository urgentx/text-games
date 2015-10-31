import java.util.ArrayList;

public class Room{
	
	Player player;
	ArrayList<Item> items;
	
	
	public void entrance(){
		
	}
	
	public void interact(){
		
		
		
	}
	
	public void checkInventory(){
		
		
			System.out.println("You're carrying:");
			for(Item i : player.getInventory()){
				System.out.println(i.getName() + " - " + i.getDescription());
			}
		
		
		
	}
	
	
	
	
	
	
}