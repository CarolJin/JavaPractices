package composition;

public class ToStringSample {

	private int year;
	private int month;
	private int day;
	
	public ToStringSample(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
		
		System.out.printf("The constructor gets result: %s\n", this); 
		// `this` - whenever I want to turn an ojbect to String, I need to repeat/rewrite `toString` method.
	}
	
	public String toString(){
		return String.format("%d/%d/%d", year, month, day);
	}
}
