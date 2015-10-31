

import java.util.*;
public class Game {
public static void main(String [] args) {
	
	/* TODO: Display intro message, get player name */
	
	Player player = new Player("Beau Dobson");	
	
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
	
	
	player.setPosition(world.getRooms().get("BedRoom"));
	
	
	
	//new game loop	
	Room currentRoom;
	while(player.isAlive()){
		currentRoom = player.getPosition();
		currentRoom.entrance();
		currentRoom.interact();
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