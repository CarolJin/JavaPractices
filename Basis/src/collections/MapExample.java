package collections;
import java.util.*;

public class MapExample {
	public static void main (String args[]){
		Map<String, List<Integer>> studuentScores = new HashMap<String, List<Integer>>();
		List<Integer> AnnaScores = new ArrayList<Integer>();
		AnnaScores.add(95);
		AnnaScores.add(91);
		AnnaScores.add(89);
		studuentScores.put("Anna", AnnaScores);
		List<Integer> JohnScores = new ArrayList<Integer>();
		JohnScores.add(85);
		JohnScores.add(91);
		JohnScores.add(99);
		studuentScores.put("John", JohnScores);
		printScores("Jjohn", studuentScores);
	}

	private static void printScores(String name, Map<String, List<Integer>> StudentScores) {
		while(!"".equals(name)){
			try{
				List<Integer> scores = StudentScores.get(name);
				for(int score : scores) {
					System.out.println(score);
				}
			} catch (Exception e){
				System.out.println("Sorry, this student doesn't exist in our system.");
			}
		}
		System.out.println("Student name is required");
	}
}
