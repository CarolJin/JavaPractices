package animals;

public class Cats extends Animals{
	
	public Cats(){
		
	}
	
	public String makeSound(){
		return "Moew";
	}
	
	public static void main(String[] args){
	Animals fido = new Dogs();
	Animals fluffy = new Cats();
	
	Animals[] theAnimals = new Animals[10];
	
	theAnimals[0] = fido;
	theAnimals[1] = fluffy;
	
	System.out.println("Fido says "+ theAnimals[0].makeSound());
	System.out.println("Fluffy says "+ theAnimals[1].makeSound());

	speakAnimal(fluffy);
	}
}
