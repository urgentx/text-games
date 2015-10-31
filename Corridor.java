

import java.util.Scanner;

public class Corridor extends Room{
	
	private Player player;
	private World world;

		public Corridor(World world){
			this.player = world.getPlayer();
			this.world = world;
			System.out.println("Corridor created.");
			
		}
	 
	 
	 public void entrance(){
		 player.setPosition(this);
		 System.out.println("A corridor lined on four surfaces with charcoal carpet extends to your right. A flickering light periodically illuminates the far end, where you can make out a woman smoking. There seem to be no exits, despite the length of the corridor. Behind you a gold-painted door leads to the room you woke up in.");		 
		 
	 }
	
	public void interact(){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().toLowerCase();
		if(input.contains("woman")){
			world.getPeople().get("Agora").interact(player);
		} else if (input.contains("door")){
			System.out.println("You slowly open the door and proceed through it.");
			
			player.setPosition(world.getRooms().get("BedRoom"));
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
		} else  if (input.contains("inventory")){
			checkInventory();
		}
	
	
	
}
	
	
}