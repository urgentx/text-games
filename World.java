import java.util.*;

public class World{
	
	private Player player;
	private Hashtable<String, Room> rooms;
	private Hashtable<String, Person> people;
	
	
	public World(Player player){
		this.player = player;
		
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
	
	public void setPeople(Hashtable<String, Person> people){
		this.people = people;
	}
	
	public Hashtable<String, Person> getPeople(){
		return people;
	}
	
	
	
	
	
	
	
	
}