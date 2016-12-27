
import java.util.*;

public class Orange extends Room {
	
	private World world;
	
	private Hashtable<String, Room> rooms;	

	public Orange(World world){
		this.player = world.getPlayer();
		this.world = world;			
	}
	 
	 
	 public void entrance(){
		 System.out.println("You put an orange on the bench. It's shiny, watery and nutritious. Do you:\ncrush, \npeel, \ntoss it?");		 
		 player.setPosition(this);
	 }
	
	public void interact(String input){
		
		if(input.contains("crush")){
			System.out.println("You crush the orange with your fist.");
			player.giveItem(world.getItems().get("Orange Pulp"));
		} else if (input.contains("peel")){
			System.out.println("You peel the orange with your fingers, leaving a bit of a mess.");
			player.giveItem(world.getItems().get("Orange Peel"));
		} else if (input.contains("toss")){
			if(world.getPlayer().getInventory().isEmpty()){
				System.out.println("You have nothing left to do, but wait out the end of your days in this grey hole. Well done!");
				System.out.println("Thanks for playing.");
				System.exit(0);			
			} else{
				System.out.println("You throw the orange down the chute, where it disappears almost noiselessly.");
				player.takeItem("Orange");
			}
		}
	}
}