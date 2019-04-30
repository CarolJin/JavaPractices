package collections;

//Java program to find first non-repeating character 
//Note : hashmap is used 

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class FindNonRepeatingCharacter {
   
 static HashMap<Character, Integer> hm = new HashMap<Character, Integer>(); 
   
  static void getIdenticalArray(String str)  
  { 
      for (int i = 0; i < str.length();  i++) 
      { 
    	  int count = 0;
         // If character already occurred,  
          if(hm.containsKey(str.charAt(i))) 
          { 
        	  count = hm.get(str.charAt(i));
          } 
          
        	  count++;
        	  hm.put(str.charAt(i), count);  
                      
      }  
      Set set1 = hm.entrySet();
      java.util.Iterator it = set1.iterator();      
      while(it.hasNext()) {
    	  Map.Entry me = (Entry) it.next();
    	  if(me.getValue().equals(1)){
    		  System.out.print(me.getKey());
      		}
      }
  } 

 // Driver method 
 public static void main (String[] args) 
 { 
     String str = "geeksforgeeksg"; 
     getIdenticalArray(str); 
 } 
}
