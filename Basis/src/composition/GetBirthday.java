package composition;

public class GetBirthday {

	private String name;
	private ToStringSample birthday;
	
	public GetBirthday(String name, ToStringSample birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	public String toString() {
		return String.format("The name is %s, and the birthday is %s", name, birthday);
		// `birthday` - whenever I want to turn an ojbect to String, I need to repeat/rewrite `toString` method.

	}
}
