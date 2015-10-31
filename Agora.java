

public class Agora extends Person{
	
	
	private String name, description;
	
	
	
	
	public void interact(Player p){
		System.out.println("The woman seems stressed out as she sucks down a Pall Mall. She gives you a mug of coffee.");
		Item coffeeMug = new Item("Coffee mug", "A mug of until recently steaming coffee.");
		p.giveItem(coffeeMug);
		
		
	}
	
	
}