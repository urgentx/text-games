/*Takes input line-by-line from file "Rooms.res" and initialises
a new room for each line.
*/


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
			
			//Get room details
			String roomName = columns[0];
			String introMessage = columns[1];
			
			//Get items
			String [] itemArray = columns[2].split("\\$");
			ArrayList<Item> items = new ArrayList<Item>();
			for(int i = 0; i < itemArray.length-1; i+=2 ){
				String itemName = itemArray[i];
				String itemDescription = itemArray[i+1];
				Item item = new Item(itemName, itemDescription);
				items.add(item);
			}
			
			//Get exits
			String [] exitArray = itemArray[itemArray.length-1].split("\\#");
			ArrayList<String> exits = new ArrayList<String>();
			for(int j = 0; j < exitArray.length; j++){
				String exit = exitArray[j];
				exits.add(exit);
			}
			
			
			//initialise room and add to room collection
			Room room = new Room(roomName, introMessage, items, exits);
			rooms.add(room);
		}		
		
	} catch(FileNotFoundException e) {
		System.out.println("Can't import file resources!");
	}
	
	return rooms;
	}
}