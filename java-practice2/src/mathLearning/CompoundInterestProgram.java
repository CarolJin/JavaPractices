package mathLearning;

//Compound Interest Program, calculate how many subscriber the youtube user will get after n days

public class CompoundInterestProgram {
	private double getnewCount(int numberOfDays) {
		double finalCount;
		double pricipal = 10000; 
		double dailyRate = .01;
		finalCount = pricipal*Math.pow((1+dailyRate), numberOfDays);
		return finalCount;
	}
	
	public static void main(String... args) {
		int day = 50;
		CompoundInterestProgram cIP = new CompoundInterestProgram();
		double count = cIP.getnewCount(day);
		System.out.println("After "+day+ " the total subscirber number will be "+ count);
	}	
}
