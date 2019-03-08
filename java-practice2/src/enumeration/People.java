package enumeration;

public enum People {

	Caroline(32, "Very nice"),
	Adam(38, "faithful"),
	John(28, "Awesome"),
	Greg(45, "Serious"),
	Matt(39, "Smart");
	
	private final int age;
	private final String description;
	
	People(int age, String desc) {
		this.age = age;
		this.description = desc;
	}
	
	public int getAge() {
		return age;
	}
	public String getDesc() {
		return description;
	}
}
