package choose_class;

import java.util.Scanner;

public class Choose_class2 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Select your class");
		System.out.println("Fighter");
		System.out.println("Mage");
		
		int Fighter;
		int Mage;
		int Class;
		
		System.out.println("To select the Fighter class, enter '4'");
		System.out.println("To select the Mage class enter '5'");
		
		Mage = 5;
		Fighter = 4;
		
		Class = input.nextInt();
		
		if (Class == Fighter) {
			System.out.println("You have chosen the Fighter class");
		}
		if (Class == Mage) {
			System.out.println("You have chosen the Mage class");
		}

		
		
		
	}

}
