package warriors;

public class WarriorGame {

	public static void main(String[] args) throws InterruptedException {
		Warrior thor = new Warrior("Thor", 800, 130, 40);
		Warrior loki = new DodgeWarrior("Loki", 700, 82, 55, .75);
		Battle.StartFight(thor, loki);
	}

}
