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
        super.println("\n\n" + s + "\n\n");
		}		
	};
	System.setOut(myStream);
	
	/* TODO: Display intro message, get player name */
	
	Player player = new Player("Beau Dobson");	
	System.out.println("The room has a chute in the corner. Type in -inventory- to see what you have on you.");
	
	//INITIALIZE WORLD
	
	World world = new World(player);
	
	//initialise people, add to world
	Person ag = new Agora();	
	Hashtable<String,Person> people = new Hashtable<String, Person>();
	people.put("Agora",ag);	
	world.setPeople(people);
	
	//initialise rooms, add to world
	Orange or =  new Orange(world);
	Corridor cr = new Corridor(world);	
	Hashtable<String, Room> rooms = new Hashtable<String, Room>();
	rooms.put("Orange", or);
	rooms.put("Corridor", cr);		
	world.setRooms(rooms);
	
	//initialise items
	Hashtable<String, Item> items =  new Hashtable<String, Item>();
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
		items.put(item.getName(), item);
	} 	
	player.giveItem(items.get("Orange"));	
	world.setItems(items);
	
	player.setPosition(world.getRooms().get("Orange"));
	
	
	
	//game loop	
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
			Set<String> keys = player.getInventory().keySet();
			for(String name : keys){
				System.out.println(name + " - " + player.getInventory().get(name).getDescription());
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

