public class BasicCalculator3 {

	public static void main(String[] args) {
		String s1 = "21-(1-(4+5-2)-3)+(6-8)";
		String s2 = " 2-1 + 2 ";
		String s3 = "2-(5-6)";
		String s4 = "(7)-(0)+(4)";
		String s5 = "1+1";
		String s6 = " ";
		Calcular1 ca = new Calcular1();
		System.out.println(ca.calculate(s1));
		System.out.println(ca.calculate(s2));
		System.out.println(ca.calculate(s3));
		System.out.println(ca.calculate(s4));
		System.out.println(ca.calculate(s5));
		System.out.println(ca.calculate(s6));
	}

	public int calculate(String s) {
		int len = s.length();
		return cal(s, 0, len);
	}

	int next = 0; //A index pointer, to continue the calculation after reaching a `)`.

	int cal(String s, int i, int len) {
		int sum = 0;
		int num = 0;
		boolean flag = true;

		while (i < len) {
			
			//Remove the spaces
			while (i < len && s.charAt(i) == ' ')
				i++;

			if (i == len)
				break;
			char c = s.charAt(i);

			if (c == '(') {
				num = cal(s, i + 1, len);
				i = next;
			}
			
			//When the `c` is number(there could be 2, 21, 231, etc)
			while ((c - '0') >= 0 && (c - '0') <= 9) {
				num = num * 10 + c - '0';
				i++;
				if (i == len)
					break;
				c = s.charAt(i);
			}

			if (!flag) {
				num = -num;
				flag = true;
			}
			sum += num;
			num = 0;

			if (c == '-') {
				flag = false;
				i++;
			}

			if (c == '+') {
				flag = true;
				i++;
			}

			if (c == ')') {
				next = i+1; 
			    i++;
				return sum; //return the temp sum to the `(` recursion calculation.
			}

		}
		return sum;
	}

}

//No stack solution (1 ms	38.1 MB)
