//Java program to find first non-repeating character, use hashmap

import java.util.HashMap; 


public class FindNonRepeatingCharacter {
   
 static HashMap<Character, Integer> hm = new HashMap<Character, Integer>(); 
   
  static void getCharCountForArray(String str)  
  { 
      for (int i = 0; i < str.length();  i++) 
      { 
    	  int count = 0;
         // If character already occurred
          if(hm.containsKey(str.charAt(i))) 
          { 
        	  hm.remove(str.charAt(i));
          } 
          else { //if character is never seen before
        	  count = 1;
        	  hm.put(str.charAt(i), count);  
          }                        
      }  
      
      System.out.println("The non repeat character string is: "+ hm.keySet());
  } 

 public static void main (String[] args) 
 { 
     String str = "geeksforgeeks"; 
     getCharCountForArray(str); 
 } 
}
