package composition;

public class BirthdayMain {

	public static void main(String[] args) {
		ToStringSample DateToString = new ToStringSample(1988,4,20);
		GetBirthday BirthdayToString = new GetBirthday("Nano", DateToString);
		
		System.out.println(DateToString);
		System.out.println(BirthdayToString);
	}
	
}
