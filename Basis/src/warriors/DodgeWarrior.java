package warriors;

import java.util.Random;

public class DodgeWarrior extends Warrior {
	
	double dodgePercent;
	Random rand = new Random();
	
	public DodgeWarrior(String name, int health, int attackMax, int blockMax, double dodgePercent) {
		super(name, health, attackMax, blockMax);
		this.dodgePercent = dodgePercent;
	}
	
	public int block() {
		double chance = rand.nextDouble();
		if(chance<= dodgePercent) {
			System.out.printf("%s dodged the attack\n", this.getName());
			return 10000;
		} else {
			return 1+(int)(Math.random()*((blockMax-1)+1));
		}
	}
}
