import java.util.Scanner;
import java.util.ArrayList;

public class Room{
	//should this be an interface?
	
	private String introMessage, roomName;
	private ArrayList<Item> items;
	private ArrayList<String> exits;
	
	public void entrance(Player player){
		System.out.println(roomName+ "\n");
		System.out.println(player.getName() + " is in the building!");
		System.out.println(introMessage);
		System.out.println("The following items are available:");
		for (int j = 0; j < items.size(); j++){
			System.out.println("(" + (j+1) + ") " + items.get(j).getName());
		}
		System.out.println("The following exits are available:");
		for(int i = 0; i < items.size(); i++){
			System.out.println("(" + (i+1) + ") " + exits.get(i));
		}
		getInput(player);
	}
	
	public void getInput(Player player){
		System.out.println("What do?");
		Scanner scanner = new Scanner(System.in);		
		String input = scanner.nextLine();
		
	}
	
	public Room(String roomName, String introMessage, ArrayList<Item> items, ArrayList<String> exits){
		this.roomName = roomName;
		this.introMessage = introMessage;
		this.items = items;
		this.exits = exits;
		
	}
	
	
}