import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();

		int[] counts = countLetters(s);

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0)
				System.out.println((char) (i + 'a') + " appears " + counts[i]);
		}
	}

	private static int[] countLetters(String s) {
		int[] counts = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				counts[s.charAt(i) - 'a']++;
			}
		}
		return counts;
	}

}
