
import java.util.*;

public class BedRoom extends Room {
	
	private World world;
	
	private Hashtable<String, Room> rooms;
	private ArrayList<Item> items;

		public BedRoom(World world){
			this.player = world.getPlayer();
			this.world = world;
			System.out.println("Bed room created");
			System.out.println(player.getName());
		}
	 
	 
	 public void entrance(){
		 System.out.println("You wake up in a stone-walled circular chamber lined with several wooden slat beds and several buckets of water. It is morning, and you hear birds chirping outside the diamond-shaped window. Hopefully you haven't overslept! A set of keys, a knife, a pressed pill, and several bronze coins lie strewn about in your bed. One iron-hinged wooden door leads out of the room.");		 
		 player.setPosition(this);
	 }
	
	public void interact(String input){
		
		if(input.contains("window")){
			System.out.println("You look out the window and notice you're higher up than expected.");
		} else if (input.contains("door")){
			System.out.println("You slowly open the door and proceed through it.");
			
			player.setPosition(world.getRooms().get("Corridor"));
		} else if (input.contains("keys")){
			Item p =  new Item("Keys", "Keys for various rooms in the castle.");			
			player.giveItem(p);
		} else if (input.contains("coin")){
			System.out.println("Found 20 bronze pieces!");	
			player.giveMoney(20);
		} else if (input.contains("pill")){
			Item pi =  new Item("Pill", "A pressed, unmarked pill of neutral smell.");			
			player.giveItem(pi);
		} else if (input.contains("knife")){
			Item c =  new Item("Knife", "A small but sharp steel folding blade.");			
			player.giveItem(c);
		} 
	
	
	
}

}