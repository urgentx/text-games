

import java.util.*;
public class Game {
public static void main(String [] args) {
	
	/* Display intro message, get player name */
	
	Player player = new Player("Gunter");
	
	
	
	Hashtable<String, Room> rooms = new Hashtable<String, Room>();
	World world = new World(player, rooms);
	Hashtable<String, Room> roomsUpdate = new Hashtable<String, Room>();
	BedRoom br =  new BedRoom(world);
	Corridor cr = new Corridor(world);
	roomsUpdate.put("BedRoom", br);
	roomsUpdate.put("Corridor", cr);
	world.setRooms(roomsUpdate);
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