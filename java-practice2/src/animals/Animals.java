package animals;

import java.util.Arrays;
import java.util.Scanner;

public class Animals {
	public static final double FAVNUMBER = 1.6180;
	
	private String name;
	private int weight;
	private boolean hasOwner =false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userinput = new Scanner(System.in);

	public Animals() {
		numberOfAnimals++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5+1=" + sumOfNumbers);
		
		int subOfNumbers = 5 - 1;
		System.out.println("5-1=" + subOfNumbers);
		
		int mulOfNumbers = 5 * 1;
		System.out.println("5*1=" + mulOfNumbers);
		
		int divOfNumbers = 5 / 1;
		System.out.println("5/1=" + divOfNumbers);		
		
		int modOfNumbers = 5 % 1;
		System.out.println("5%1=" + modOfNumbers);
		
		System.out.println("Enter the name: \n");
		
		if(userinput.hasNextLine()){
			this.setName(userinput.nextLine());
		}
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
	}
	
	public void setUniqueID() {
		long minNumber =1;
		long maxNumber = 10000;
	    this.uniqueID= minNumber + (long)(Math.random()*(maxNumber - minNumber) +1);
		System.out.println("Unique ID set to: " + this.uniqueID);
		
		String stringNumber = Long.toString(maxNumber);
		int numberString = Integer.parseInt(stringNumber);
		
	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	
	public void setFavoriteChar() {
		int randomNumber = (int)(Math.random()*126) +1;
		
		this.favoriteChar = (char)randomNumber;
		
		if (randomNumber == 32){
			System.out.println("Favorite character is space");
		} else if (randomNumber == 10){
			System.out.println("Favorite character is new line");
		} else{
			System.out.println("Favorite character is " + this.favoriteChar);
		}
		
		if((randomNumber >97) && (randomNumber < 122)){
			System.out.println("Favorite character is a lowercase");
		}
		
		if(((randomNumber >97) &&(randomNumber <122)) || ((randomNumber>64) && (randomNumber<91))){
		    System.out.println("Favorite character is a letter");
		}
		
		int whichIsBigger = (50 > randomNumber) ? 50: randomNumber;
		
		switch(randomNumber){
		case 8:
			System.out.println("Favorite character is back");
			break;
		case 10:
			System.out.println("Favorite character is backslash");
			break;	
		default:
			System.out.println("Favorite character is default");
			break;
		}
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	protected static void countTo(int startingNumber){
		for(int i = startingNumber; i<=100; i++){
			if(i==90) continue;
			System.out.println(i);
		}
	}
	
	protected static String SprintNumber(int maxNumbers){
		int i=1;
		while(i<(maxNumbers/2)){
			System.out.println(i);
			i++;
			if(i==(maxNumbers/2)) break;
		}
		
		Animals.countTo(maxNumbers/2);
		return "end of printNumber";
	}
	
	protected static void guessMyNumber(){
		int number;
		
		do{
			System.out.println("Guess number up to 100");
			while (!userinput.hasNextInt()){
				String numberEntered =userinput.next();
				System.out.printf("%s is not a number \n", numberEntered);
			}
			number =userinput.nextInt();
		} while(number != 50);
	}
	
	public String makeSound(){
		return "Grrrr";
	}
	
	public static void speakAnimal(Animals randAnimal){
		System.out.printf("Animal says ", randAnimal.makeSound());
	}

	public static void main(String[] args){
//		Animals theAnimal = new Animals();
		
		String[] stringArray = {"cat", "dog", "other"};
		for(String animalString: stringArray){
			if("cat".equals(animalString)){
			System.out.println("The animal is " + animalString);
			}
		}
		
		String[] cloneOfArray = Arrays.copyOf(stringArray, 3);
		System.out.println("The copy element is " + Arrays.toString(cloneOfArray));
		System.out.println(Arrays.binarySearch(cloneOfArray, "other"));
		
		
		String[][][] multiArray = {{{"000"},{"001"},{"002"},{"003"}},{{"010"},{"011"},{"012"},{"013"}}, {{"100"},{"101"},{"102"},{"103"}}};
		for(int i=0; i<multiArray.length; i++){
			for(int j=0; j<multiArray[i].length; j++){
				for(int k=0; k<multiArray[i][j].length; k++){
					System.out.print("|" + multiArray[i][j][k]);
				}					
			}
		}
		
	}
}
