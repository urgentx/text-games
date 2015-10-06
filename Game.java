import java.util.ArrayList;
public class Game {
public static void main(String [] args) {
	
	/* Display intro message, get player name */
	
	Player player = new Player("Gunter");
	ArrayList<Room> rooms =  new ArrayList<Room>();
	
	
	RoomLoader roomLoader = new RoomLoader();
	rooms = roomLoader.load();
	
	rooms.get(0).entrance(player);
	player.setPosition(rooms.get(0));
	while (player.isAlive()){
		int index = rooms.indexOf(player.getPosition());
		rooms.get(index).entrance(player);
		//rooms.get(index).getInput(player);
		break;
	}
	
}
}