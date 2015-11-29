

import java.util.*;
public class Game {
public static void main(String [] args) {
	
	/* TODO: Display intro message, get player name */
	
	Player player = new Player("Beau Dobson");	
	System.out.println("You wake up in a bed. The white sheets are clean and warm against your body.");
	
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
	Headquarters hq = new Headquarters(world);
	Hashtable<String, Room> rooms = new Hashtable<String, Room>();
	rooms.put("BedRoom", br);
	rooms.put("Corridor", cr);	
	rooms.put("Headquarters", hq);
	world.setRooms(rooms);
	
	
	player.setPosition(world.getRooms().get("BedRoom"));
	
	
	
	//new game loop	
	Room currentRoom;
	while(player.isAlive()){
		currentRoom = player.getPosition();
		currentRoom.entrance();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().toLowerCase();		
		
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
	
	
	
	/*Old game initialiser and loop.
	player.setPosition(rooms.get(0));
	ArrayList<Room> rooms =  new ArrayList<Room>();
	RoomLoader roomLoader = new RoomLoader();
	rooms = roomLoader.load();
	while (player.isAlive()){
		int index = rooms.indexOf(player.getPosition());
		rooms.get(index).entrance(player);
		//rooms.get(index).getInput(player);
		break;
	}*/
	
}
	
}