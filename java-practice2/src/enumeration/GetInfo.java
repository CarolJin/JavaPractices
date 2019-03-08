package enumeration;

import java.util.EnumSet;

public class GetInfo {

	public static void main(String[] args) {
		for( People p : People.values()) {
			System.out.printf("The person's name is %s, age is %d, description is %s\n", p, p.getAge(), p.getDesc());
		}
		for( People p : EnumSet.range(People.Adam, People.Greg)) {
			System.out.printf("One of the talent persons is: %s\t%d\t%s\n", p, p.getAge(), p.getDesc());
		}
		
	}
}
