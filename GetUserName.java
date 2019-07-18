import java.util.*;
import java.util.regex.*;

public class GetUserName {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		ArrayList<String> firstNames = new ArrayList<>();

		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");

			String firstName = firstNameEmailID[0];

			String emailID = firstNameEmailID[1];

			final Pattern pattern = Pattern.compile(".*@gmail.com$");
			//^[a-z]+@gmail\\.com$
			if (pattern.matcher(emailID).matches()) {
				firstNames.add(firstName);
			}
		}

		Collections.sort(firstNames);
		firstNames.forEach(itv -> System.out.printf("%s\n", itv));

		scanner.close();
	}

}
