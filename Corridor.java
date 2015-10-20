

import java.util.Scanner;

public class Corridor extends Room{
	
	private Player player;

		public Corridor(World world){
			this.player = world.getPlayer();
			System.out.println("Corridor created");
		}
	 
	 
	 public void entrance(){
		 System.out.println("A corridor lined on four surfaces with charcoal carpet extends to your right. A flickering light periodically illuminates the far end, where you can make out someone smoking.");		 
		 player.setPosition(this);
	 }
	
	public void interact(){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().toLowerCase();
		if(input.contains("window")){
			System.out.println("You look out the window and notice you're higher up than expected.");
		} else if (input.contains("door")){
			System.out.println("You slowly open the door and proceed through it.");
			
		}
	
	
	
}
	
	
}