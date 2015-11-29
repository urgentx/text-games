
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
		 System.out.println("The odd sound of traffic can be heard from a window across the room, through which you see a starry night sky. Your keys, wallet, a pill and a wrapped prophylactic lie strewn about on the floor. A single white, wooden door leads out of the room.");		 
		 player.setPosition(this);
	 }
	
	public void interact(String input){
		
		if(input.contains("window")){
			System.out.println("You look out the window and notice you're higher up than expected.");
		} else if (input.contains("door")){
			System.out.println("You slowly open the door and proceed through it.");
			
			player.setPosition(world.getRooms().get("Corridor"));
		} else if (input.contains("keys")){
			Item p =  new Item("Keys", "Just your house keys, cars are for suckers.");			
			player.giveItem(p);
		} else if (input.contains("wallet")){
			Item w =  new Item("Wallet", "Contains your ID, $30 dollars cash and some business cards.");			
			player.giveItem(w);
		} else if (input.contains("pill")){
			Item pi =  new Item("Pill", "A pressed, unmarked pill of neutral smell.");			
			player.giveItem(pi);
		} else if (input.contains("prophylactic") || input.contains("condom")){
			Item c =  new Item("Condom", "A rubber johnny. No needle holes.");			
			player.giveItem(c);
		} 
	
	
	
}

}