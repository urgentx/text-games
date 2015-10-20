

public class Item{
	
	private String name, description;
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Item(String name, String description){
		this.name = name;
		this.description = description;		
		System.out.println("Item created: " + name + " " + description);
	}
	
}