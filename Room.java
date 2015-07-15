import java.util.Scanner;
import java.util.ArrayList;

public class Room{
	//should this be an interface?
	
	private String introMessage, roomName;
	private ArrayList<Item> items;
	
	public void entrance(Player player){
		System.out.println(roomName+ "\n");
		System.out.println(player.getName() + " is in the building!");
		System.out.println(introMessage);
	}
	
	public void getInput(Player player){
		System.out.println("What do?");
		Scanner scanner = new Scanner(System.in);		
		String input = scanner.nextLine();
		
	}
	
	public Room(String roomName, String introMessage, ArrayList<Item> items){
		this.roomName = roomName;
		this.introMessage = introMessage;
		this.items = items;
		
	}
	
	
}