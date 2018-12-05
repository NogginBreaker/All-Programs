package rpg;

import java.util.Scanner;

public class Switch_Statements {

public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
// Main actions
		int take = 10;
		int drop = 20;
		int interact = 30;
		int walk = 40;
		int kill = 50;
		
// Beginning of story
		System.out.println("|-Actions-------|");
		System.out.println("|-Take = 1      |");
		System.out.println("|-Drop = 2      |");
		System.out.println("|-Interact = 3  |");
		System.out.println("|-Walk = 4      |");
		System.out.println("|-Kill = 5      |");
		System.out.println("|---------------|");
		System.out.println("");
		System.out.println("Remember, if the program asks you to enter in \n"
						 + "an action not listed above, enter the command as \n"
						 + "it is written example : (Walk to the forest -  \n"
						 + "only enter the word 'Walk' into the console)");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print("A stone castle lies infront of you, walls stretching \n"
					   + "towards the sky. There is a wooden gate that is currently \n"
					   + "down. You hear guards shouting to raise the gates");
		System.out.println("");
		
		int story_decision = 1;
		
// Decision 1
		int decision = input.nextInt();
		
// Fix infinite loop
		boolean x = true;
		boolean y = true;
		boolean a = true;
		boolean b = true;
		
		
		
// Breaks the loop
questChoice:
// Choose which quest to go on - BARD or EXPLORE
		while (x = true) {
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
			while (y = true) {
			if (decision2.startsWith("Explore")) {
				System.out.print("You decide to explore the city. The guard hesitantly \n"
							   + "lets you through the gates");
				// Story = 2
				story_decision ++;
				// Exit the loop
				x = false;
				y = false;
				break questChoice;
			}
			else if (decision2.startsWith("Talk")) {
				System.out.print("You tell the guard you are here to talk to an \n"
							   + "old bard that goes by the name Bongo Jim \n"
							   + "The guards let you into the city and you begin \n"
							   + "your hunt to find your old friend");
				// Story = 3
				story_decision ++;
				story_decision ++;
				// Exit the loop
				x = false;
				y = false;
				break questChoice;
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
			break;
			}
			decision = input.nextInt();
			
		}

// Continue the story (so far 2 decisions
		System.out.println("");
		System.out.println("The city was quite odd. Nobody, except for a few poor souls, \n"
							 + "were walking the streets of Haven. It was almost like everyone \n"
							 + "had vanished.");
		System.out.println("");
		System.out.println("What whould you like to do now?");
		System.out.println("");
			
			
// Choose what to do in the city
		String decision3 = input.next();
city:
		while (a = true) {
		switch (decision % 10) {
// Take action
		case 1:
			System.out.println("You pick up your hands. You have now \n"
							 + "equiped your hands");
			break;
// Drop action
		case 2:
			System.out.println("You reach into your pocket and pull out \n"
							 + "a dead squirell. His eyes are glazed over, flesh already"
							 + "rotting. Why would you keep a dead squirell in \n"
							 + "your pocket?");
			break;
// Interact action
		case 3:
			System.out.println("You wave goodbye to the guards. They do not wave back");
			break;
// Walk action
		case 4:
			System.out.println("You walk into the city of Haven. As you turn the corner of \n"
							 + "the market place, your nose is instantly assaulted with the \n"
							 + "smell of death. Perhaps there was a reason nobody was \n"
							 + "on the streets");
			System.out.println("");
			System.out.println("You cover your nose in a vain attempt to mask the awful smell \n"
						     + "Suddenly something catches your eye. You look down an alley way \n"
						     + " to see someone in a dark cloak hunched over a dead body.");
			System.out.println("");
			System.out.println("You run up to the man out of curiosity. You looks at you, \n"
							 + "hisses, and runs with an amazing agility down the alley way");
			a = false;     
			break city;
// Kill action
		case 5:
			System.out.println("Overhead you hear the cry of a magestic seagull \n"
							 + "As you gaze upward there is indeed a seagull. You chuck a \n"
							 + "rock at it and...");
			int rock = (int)(Math.random() * 100);
			if (rock > 50) {
			System.out.println("You successfully kill the annoying seagull with a single \n"
						     + "mighty blow. The seagull has perished");	
			}
			else {
			System.out.println("You throw the rock high into the sky, hoping that it \n"
							 + "will end the annoying seagull once and for all you wait \n"
							 + "for a long while, util the rock eventually falls down and \n"
							 + "hits you square in the face");
			}
			a = false;
			break city;
				}
				}
			
			
			
			
			

			}
		
	}


