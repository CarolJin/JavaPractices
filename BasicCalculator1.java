/*
Basic Calculator
The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .

Example 1:

Input: "1 + 1"
Output: 2
Example 2:

Input: " 2-1 + 2 "
Output: 3
Example 3:

Input: "(1+(4+5+2)-3)+(6+8)"
Output: 23
*/

class BasicCalculator1 {
public int calculate(String s) {

	if (s == null || s.length() == 0)
		return 0;

	s = s.replace(" ", "");

	int sum = 0;
	Stack<Character> st = new Stack<>();

	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) != ')')
			st.push(s.charAt(i));
		else {
			int tempSum = 0;
			char curr = 0;
			while (!st.isEmpty() && curr != '(') {
				curr = st.pop();

				StringBuffer temp = new StringBuffer();
				while (Character.getNumericValue(curr) >= 0) {
					temp.insert(0, curr);
					if (!st.isEmpty())
						curr = st.pop();
				}

				if (temp.length() != 0 && curr == '+') {
					tempSum += Integer.valueOf(temp.toString());
				}

				if (temp.length() != 0 && curr == '-') {
					tempSum -= Integer.valueOf(temp.toString());
				}

				if (temp.length() != 0 && curr == '(') {
					tempSum += Integer.valueOf(temp.toString());
				}
			}

			for (char c : String.valueOf(tempSum).toCharArray()) {
				if (!st.isEmpty() && st.peek() == '-' && c == '-') {
					st.pop();
					c = '+';
					st.push(c);
				} else if (!st.isEmpty() && st.peek() == '+' && c == '-') {
					st.pop();
					st.push(c);
				} else if (!st.isEmpty() && st.peek() == '-' && c == '+'
						|| !st.isEmpty() && st.peek() == '+' && c == '+') {
					continue;
				} else
					st.push(c);
			}

		}
	}

	while (!st.isEmpty()) {
		char curr = st.pop();

		StringBuffer temp = new StringBuffer();
		while (Character.getNumericValue(curr) >= 0) {
			temp.insert(0, curr);
			if (st.isEmpty())
				break;
			else
				curr = st.pop();
		}

		if (temp.length() != 0 && curr == '-') {
			sum -= Integer.valueOf(temp.toString());
		} else if (temp.length() != 0 && curr == '+') {
			sum += Integer.valueOf(temp.toString());
		} else if (temp.length() > 0) {
			sum += Integer.valueOf(temp.toString());
		}
	}

	return sum;

}
