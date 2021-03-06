

import java.util.Scanner;

public class Corridor extends Room{
	
	private Player player;
	private World world;

		public Corridor(World world){
			this.player = world.getPlayer();
			this.world = world;			
		}
	 
	 
	 public void entrance(){
		 player.setPosition(this);
		 System.out.println("\n\n\nA corridor lined on four surfaces with charcoal carpet extends to your right. A flickering light periodically illuminates the far end, where you can make out a woman smoking. There seem to be no exits, despite the length of the corridor. Behind you a gold-painted door leads to the room you woke up in.");		 
		 
	 }
	
	public void interact(String input){
		
		if(input.contains("woman")){
			world.getPeople().get("Agora").interact(player);
		} else if (input.contains("door")){
			System.out.println("You slowly open the door and proceed through it.");
			
			player.setPosition(world.getRooms().get("BedRoom"));
		
		} else  if (input.contains("inventory")){
			checkInventory();
		} else if (input.contains("panel")){
			System.out.println("After a while pushing and pulling panels along the walls, you find one that slides aside. A dark tunnel lined with brushed steel large enough to walk through lies behind it, with the sound of crying emanating from somewhere far within.");
		} else if (input.contains("tunnel")){
			System.out.println("You venture slowly through the tunnel.");
			player.setPosition(world.getRooms().get("Headquarters"));
		}
			
	
	
	
}
	
	
}