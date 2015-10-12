import java.util.ArrayList;
public class Game {
public static void main(String [] args) {
	
	/* Display intro message, get player name */
	
	Player player = new Player("Gunter");
	
	
	
	
	
	
	
	
	//new game loop
	BedRoom br =  new BedRoom(player);
	br.entrance();
	br.interact();
	
	
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