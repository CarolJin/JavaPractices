package freePractice;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "value1";
		str1.concat(" value2"); // Only create an new string object, not changing str1 value
		String str3= "value3";
		str3+=str1;
		System.out.println(str1); //String value is immutable
		System.out.println(str3);
	}

}
