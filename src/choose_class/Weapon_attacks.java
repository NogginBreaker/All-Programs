package choose_class;
import java.util.concurrent.ThreadLocalRandom;
public class Weapon_attacks {

	public static void main(String[] args) {
		//Long sword
		int longsword = (int) (Math.random() * (10 - 1));
		System.out.println(longsword);
		
		//Battle axe
		int battle_axe = (int) (Math.random() * (12 - 1));
		System.out.println(battle_axe);
		
		//Short bow
		int short_bow = (int) (Math.random() * (6 - 1));
		System.out.println(short_bow);
		
		//Fire bolt
		int fire_bolt = (int) (Math.random() * (10 - 1));
		System.out.println(fire_bolt);
		
		//Fire ball
		int fire_ball = (int) (Math.random() * (48 - 6));
		System.out.println(fire_ball);

	}

}
