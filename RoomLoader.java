import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
public class RoomLoader {
	
	private ArrayList rooms = new ArrayList<Room>();
	
	private ArrayList<String> lines = new ArrayList<String>();
	
	public ArrayList load(){
	File file = new File("Rooms.res");
	
	try (Scanner scanner = new Scanner(file);) {
		while(scanner.hasNextLine()){			
			String[] columns = scanner.nextLine().split("\\|");
			String roomName = columns[0];
			String introMessage = columns[1];
			String itemName = columns[2];
			String itemDescription = columns[3];
			String exit = columns[4];
			Item item = new Item(itemName, itemDescription);
			ArrayList<Item> items = new ArrayList<Item>();
			items.add(item);
			ArrayList<String> exits = new ArrayList<String>();
			exits.add(exit);
			Room room = new Room(roomName, introMessage, items, exits);
			rooms.add(room);
		}		
		
	} catch(FileNotFoundException e) {
		System.out.println("Can't import file resources!");
	}
	
	return rooms;
	}
}