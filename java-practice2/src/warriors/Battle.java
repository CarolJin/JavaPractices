package warriors;

public class Battle {

	public static void StartFight(Warrior w1, Warrior w2) throws InterruptedException {
		while(true) {
			if(getAttackResult(w1, w2).equals("Game Over!")) {
				System.out.printf("Game over!");
				break;
			}
			if(getAttackResult(w2, w1).equals("Game Over!")) {
				System.out.printf("Game over!");
				break;
			}
		}
	}
	
	public static String getAttackResult(Warrior wA, Warrior wB) throws InterruptedException {
		int wAAttackAmt =wA.attack();
		int wBBlockAmt = wB.block();
		
		int dmgOfWarB = wAAttackAmt - wBBlockAmt;
		if(dmgOfWarB>0) {
			wB.health = wB.health - dmgOfWarB;
		} else dmgOfWarB=0;
		
		System.out.printf("%s attacks %s and deals %d Damage\n", wA.getName(), wB.getName(), dmgOfWarB);
		System.out.printf("%s has %d health\n", wB.getName(), wB.health);
		Thread.sleep(1500);
		if(wB.health<=0) {
			System.out.printf("%s has died, %s is the victorious\n", wB.getName(), wA.getName());
			return "Game Over!";
		}
		return "Fight again!";
	}
}
