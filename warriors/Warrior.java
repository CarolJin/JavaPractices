package warriors;

public class Warrior {

	protected String name = "Warrior";
	public int health = 0;
	public int attackMax = 0;
	public int blockMax = 0;

	public Warrior() {
		
	}

	public Warrior(String name, int health, int attackMax, int blockMax) {
		this.setName(name);
		this.health = health;
		this.attackMax = attackMax;
		this.blockMax = blockMax;
	}

	public void setName(String name2) {
		name = name2;		
	}
	
	public String getName() {
		return name;
	}
	
	public int attack() {
		return 1+(int)(Math.random()*((attackMax-1)+1));
	}
	
	public int block() {
		return 1+(int)(Math.random()*((blockMax-1)+1));
	}

}
