package rpg;
/*
 * Zachary Moncur
 * 11/13
 */
import java.util.Scanner;
public class Begin {

	private static final boolean Wizard = false;
	private static final boolean Explore = false;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Main actions
		String Take = "Take";
		String Drop = "Drop";
		String Look = "Look";
		String Smell= "Smell";
		String Climb = "Climb";
		String Listen = "Listen";
		String Walk = "Walk";
		String Kill = "Kill";
		
		// Objects to interact with
		String ground = "ground";
		String air  = "air";
		String hands = "hands";
		String object = "object";
		
		// Extra
		String Talk = "Talk";
		//String Explore = "Explore";
		
		// Quest line
		boolean Quest = Explore || Wizard;
		String Wizard = "Wizard";
		String Explore = "Explore";
		
		// Beginning of story
		System.out.println("|--------------|--------------|");
		System.out.println("|     Take     |    Drop      |");
		System.out.println("|     Look     |    Smell     |");
		System.out.println("|     Climb    |    Listen    |");
		System.out.println("|     Walk     |    Kill      |");
		System.out.println("|--------------|--------------|");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print("A stone castle lies infront of you, walls stretching \n"
					   + "towards the sky. There is a wooden gate that is currently \n"
					   + "down. You hear guards shouting to raise the gates");
		System.out.println("");
		
		// DRAWBRIDGE interaction
		
		// Choose which quest to go on - WIZARD or EXPLORE
	String choiceWalk = input.next();
		if (choiceWalk.equalsIgnoreCase(Walk)) {
		System.out.println("You walk to the gates. A guard asks you to stop and \n"
			 		      + "state your buisness entering Haven");
		System.out.println("You explain to him that you are here to: \n"
						  + "- Explore the city \n"
						  + "- Talk to a wizard");
	String choice1 = input.next();
		// Talk with the WIZARD
		if (choice1.startsWith(Talk)) {
		System.out.println("You explain to the guard that you are here to talk \n"
						  + "to a wizard named Avitus. The guard lets you go, but \n"
						  + "eyes you suspiciously as you walk by");
		// This should be what determines the quest
		}
		// EXPLORE the city
	String choice2 = input.next();
		if (choice2.equals(Explore)) {
		System.out.println("The guard raises an eyebrow, and explains to you \n"
						 + "that there is a disease spreading around town. You can \n"
						 + "tell that he's puzzled as to why you would want to enter \n"
						 + "the city. Never the less he lets you through the gates");
		// This will determine the quest
		}
		}
	String choiceTake = input.next();
		if (choiceTake.equalsIgnoreCase(Take)) {
			System.out.println("You can not take anything at this time");
		}
	String choiceDrop = input.next();
		if (choiceDrop.equalsIgnoreCase(Drop)) {
			System.out.println("You are currently carrying nothing but your hands");
		if (choiceDrop.startsWith(Drop)) {
			System.out.println("Comrade, you cannot drop your hands");
		}
		}

		
		
		
		
		
		
		
		
		
		// Need to find a way to make the choices in the If statements theme selves 
		// Add in the ascii art at the very end, so it doesn't take u[ so much space
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
