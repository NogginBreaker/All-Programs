package choose_class;
/*
 * Zachary Moncur
 * 10/4/18
 */

import java.util.Scanner;
public class Choose_class {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		System.out.println("Select your class");
		System.out.println("Fighter");
		System.out.println("Mage");
		
		char Fighter;
		char Mage;
		double Class;
		
		Fighter = 'F'+'i'+'g'+'h'+'t'+'e'+'r';
		Mage = 'M'+'a'+'g'+'e';
		Class = input.nextDouble();
		
		if (Class == Fighter) {
			System.out.println("You have chosen the Fighter class");
		}
		else if (Class == Mage) {
			System.out.println("You have chosen the Mage class");
		}

		
		

		

	}

}
