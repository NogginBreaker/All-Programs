package rpg;

import java.util.Scanner;

public class String_Story {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Main actions
				String take = "Take";
				String drop = "Drop";
				String interact = "Interact";
				String walk = "Walk";
				String kill = "Interact";
				
		// Beginning of story
				System.out.println("|-Actions-------|");
				System.out.println("|-Take          |");
				System.out.println("|-Drop          |");
				System.out.println("|-Interact      |");
				System.out.println("|-Walk          |");
				System.out.println("|-Kill          |");
				System.out.println("|---------------|");
				System.out.println("");
				System.out.println("Remember, if the program asks you to enter in \n"
								 + "an action not listed above, enter the command as \n"
								 + "it is written");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.print("A stone castle lies infront of you, walls stretching \n"
							   + "towards the sky. There is a wooden gate that is currently \n"
							   + "down. You hear guards shouting to raise the gates");
				System.out.println("");
				
		// Decision 1
				int decision = input.nextInt();
				
		// Choose which quest to go on - WIZARD or EXPLORE
				while (true) {
				switch (decision % 10 ) {
		// Take action
				case 1:
					System.out.println("There is nothing to take at this time");
					break;
		// Drop action
				case 2:
					System.out.println("You are currently carrying nothing at this time");
					break;
		// Interact action
				case 3:
					System.out.println("You shout to the guards and ask them to stop raising \n"
									 + "the gates. They hesitantely listen");
					break;
		// Walk action
				case 4:
					System.out.println("You walk to the gates. A guard asks you to stop and \n"
									 + "state your buisness entering Haven");
					System.out.println("You explain to him that you are here to: \n"
									 + "- Explore the city \n"
									 + "- Talk to a bard");
					String decision2 = input.next();
					while (true) {
					if (decision2.startsWith("Explore")) {
						System.out.print("You decide to explore the city");
						break;
					}
					else if (decision2.startsWith("Talk")) {
						System.out.print("You tell the guard you are here to talk to an \n"
									   + "old bard that goes by the name Bongo Jim \n"
									   + "The guards let you into the city and you begin \n"
									   + "your hunt to find your old friend Bongo Jim");
						break;
					}
					else {
						System.out.println("That is not a viable option, sorry");
						decision2 = input.next();
					}
				}
					break;
		// Kill action
				case 5:
					System.out.println("You attempt to kill the guards, but are instantly killed \n"
									 + "by a the overwhelming amount of death that penetrates through \n"
									 + "your soul. You have died");
					System.out.println("");
					System.out.println("You have failed. Exiting game in 5 seconds");
					System.exit(5);
					}
					decision = input.nextInt();
				}

	}

}
