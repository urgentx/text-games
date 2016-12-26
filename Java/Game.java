import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Game {
	
	private ArrayList<Item> items;	
	
public static void main(String [] args) {	

	//Alter System.out to always add newlines before output. 
	
	PrintStream myStream = new PrintStream(System.out) {
		@Override
		public void println(String s) {
        super.println("\n\n" + s);
		}
	};
	
	/* TODO: Display intro message, get player name */
	
	Player player = new Player("Beau Dobson");	
	System.out.println("Castle Elyse is one of the biggest in the land, and for centuries among the most prosperous. However, in recent years the place has declined. Surrounding peasants have slowly but surely emigrated, despite strong military containment from the king. With the region on the verge of famine, King Tsidas has problems on his hands, although his mannerisms suggest he is in denial of the deterioration of Elyse. In the absence of any official reasoning for the spike in poverty, many suspect sinister, clandestine and dishonest ongoings within the castle..\n\nYou are a servant in the castle, as have your parents been for generations. What better person to explore unnoticed the castle's many corridors and rooms than you?");
	
	//INITIALIZE WORLD
	
	World world = new World(player);
	
	//initialise people, add to world
	Person ag = new Agora();	
	Hashtable<String,Person> people = new Hashtable<String, Person>();
	people.put("Agora",ag);	
	world.setPeople(people);
	
	//initialise rooms, add to world
	BedRoom br =  new BedRoom(world);
	Corridor cr = new Corridor(world);	
	Hashtable<String, Room> rooms = new Hashtable<String, Room>();
	rooms.put("BedRoom", br);
	rooms.put("Corridor", cr);		
	world.setRooms(rooms);
	
	//initialise items
	Scanner itemScanner = new Scanner(System.in);
	try{
	itemScanner = new Scanner(new File("Items.res"));
	} catch(FileNotFoundException e){
		System.out.println("File not found.");
	}
	String[] itemInput = new String[100];
	while(itemScanner.hasNextLine()){
		itemInput = itemScanner.nextLine().split("\\*");
		Item item = new Item(itemInput[0], itemInput[1]);
	} 
	
	player.setPosition(world.getRooms().get("BedRoom"));
	
	
	
	//new game loop	
	Room currentRoom;
	String input = new String();
	while(player.isAlive()){
		currentRoom = player.getPosition();
		currentRoom.entrance();
		
		//get input
		try{			
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine().toLowerCase();		
		} catch(Exception e){
			System.out.println("Error reading input!");			
		}
		
		//inventory check
		if (input.contains("inventory")){
			System.out.println("You're carrying:");
			for(Item i : player.getInventory()){
				System.out.println(i.getName() + " - " + i.getDescription());
			}
		}
		//quit check
		else if (input.contains("quit")){
			System.out.println("Thanks for playing.");
			System.exit(0);			
		} else {			
		currentRoom.interact(input);
		}
	}
	
}

	
}

