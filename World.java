import java.util.*;

public class World{
	
	private Player player;
	private Hashtable<String, Room> rooms;
	
	
	public World(Player player, Hashtable<String, Room> rooms){
		this.player = player;
		this.rooms = rooms;
	}
	
	public void setPlayer(Player player){
		this.player = player;
	}
	
	public Player getPlayer(){
		return player;
	}
	
	public void setRooms(Hashtable<String, Room> rooms){
		this.rooms = rooms;
	}
	
	public Hashtable<String, Room> getRooms(){
		return rooms;
	}
	
	
	
	
	
	
	
	
}