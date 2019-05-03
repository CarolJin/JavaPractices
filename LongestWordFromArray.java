public class LongestWordFromArray{
  public static void main (String[] args) {
		String[] str1 = {"a","b", "be","ap", "app", "appl", "apple", "apply", "append"};
		String[] str2= {"a", "banana", "app", "appl", "ap", "apply", "apple"};
		System.out.println("The longest word is: "+longestWord(str2).toString());
	}
	
	 public static String longestWord(String[] words) {
	        
	        String output = "";
	        HashSet<String> hs = new HashSet<String>();
	        ArrayList<Integer> al = new ArrayList<Integer>();
	
	        
	        for(String word: words) hs.add(word);
	        
	        for(String word: words) {
	            boolean flag = true;
	            if(word.length()>output.length() || word.compareTo(output)<0 && word.length()==output.length()) {
	                for(int i=word.length()-1; i>0; i--) {
	                    if(!hs.contains(word.substring(0,i))) {
	                     flag = false;
	                     break;
	                    }
	                }
	            if(flag) output= word; 
	          }               
	        }
	        return output;
	    }
  }
