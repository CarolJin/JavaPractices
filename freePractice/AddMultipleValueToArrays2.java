package freePractice;

import java.util.Arrays;

public class AddMultipleValueToArrays2 {
	
		private Object[] items;
		private final int size;

		// Constructs an Object array and initialize it with given values
		public AddMultipleValueToArrays2(Object... values)
		{
			this.size = values.length;
			this.items = Arrays.copyOf(values, size);
		}

		public Object get(int i) {
			return items[i];
		}

		public int getSize() {
			return size;
		}

		@Override
		public String toString() {
			return Arrays.toString(items);
		}
	}

	class Util
	{
		public static AddMultipleValueToArrays2 getDetails()
		{
			String name = "Ryan";
			int age = 25;
			char gender = 'M';
			long income = 100000;

			return new AddMultipleValueToArrays2(name, age, gender, income);
		}

		// Return multiple values from a method in Java
		public static void main(String[] args)
		{
			AddMultipleValueToArrays2 details = getDetails();

			System.out.println("Returned Values are " + details);
			System.out.println("Collection size is : " + details.getSize());
			System.out.println("Name field has value " + details.get(0));
		}
}
