
import java.util.*;

public class BedRoom extends Room {
	
	private World world;
	private Player player;
	private Hashtable<String, Room> rooms;

		public BedRoom(World world){
			this.player = world.getPlayer();
			this.world = world;
			System.out.println("Bed room created");
		}
	 
	 
	 public void entrance(){
		 System.out.println("You wake up in a bed. The white sheets are clean and warm against your body.The odd sound of traffic can be heard from a window across the room, through which you see a starry night sky. A single white, wooden door leads out of the room.");		 
		 player.setPosition(this);
	 }
	
	public void interact(){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().toLowerCase();
		if(input.contains("window")){
			System.out.println("You look out the window and notice you're higher up than expected.");
		} else if (input.contains("door")){
			System.out.println("You slowly open the door and proceed through it.");
			
			player.setPosition(world.getRooms().get("Corridor"));
		}
	
	
	
}

}