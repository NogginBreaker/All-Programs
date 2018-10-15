package choose_class;
import java.util.Scanner;
public class Archetype {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean fighter_archer = false;
		boolean fighter_warrior = false;
		boolean mage_necromancer = false;
		boolean mage_evocation = false;
		
		int archetype;
		
		System.out.println("Choose an archetype");
		archetype = input.nextInt();
		
		if (fighter_archer == true) {
			System.out.println("You have chosen to be an archer");
		}
		
		
		

	}

}
