import java.util.Scanner;

public class Agora extends Person{
	
	
	private String name, description;
	
	
	
	
	public void interact(Player p){
		System.out.println("The woman seems stressed out as she sucks down a Pall Mall. Maybe she can help you find out where you are. She stares you down indignantly as you approach, and you find yourself wondering whether she sees the attraction in your eyes. \n  \"How can I help you?\", she asks. ");
		
		System.out.println("1) I'm lost. Could you tell me where we are?\n2) Few things are finer than a woman smoking. The dichotomy between the life-giving and life-taking yields a provocative aesthetic. \n3) Nevermind, I'm just passing through");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().toLowerCase();
		switch (input) {
			case "1": System.out.println("She looks surprised. \"We're in the Bambino Institution. You didn't know that?\"");
				System.out.println("1) No, I knew that. I was just checking if you did. Say, you wouldn't know the way out, would ya?");
				if(scanner.nextLine().toLowerCase().equals("1")){
					System.out.println("You could try the secret door? It's behind one of the panels in this very corridor.");
					break;
				}			
			
			case "2": System.out.println("She seems taken aback by the depth of your compliment, and responds with positive body language. ");
				System.out.println("1) Are you busy right now? Cos I'm not. ");
				if(scanner.nextLine().toLowerCase().equals("1")){
					System.out.println("Coldly she answers: \"I don't really know you, and not for free!\"");
						if(scanner.nextLine().toLowerCase().equals("pill")){
						System.out.println("She looks the pale white ball over and exclaims:\"Th-this is Zivacil!\" She surrenders some very useful information among other things.");
						break;
				}			
					break;
				}		
			
		}
	}
	
	
}