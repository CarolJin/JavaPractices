public class DeletionDistance {

	  static int deletionDistance(String str1, String str2) {
	        int output = 0;
	    
	    return moveOnTofollowChars(str1, str2, output);
	  
	  }	 

//	  static int moveOnTofollowChars(String str1, String str2, int output) {
//		 int i = str1.length()-1;
//		 int j = str2.length()-1;
//	    if(i<0 && j<0) return output;
//	    if(i<0) return output+j+1;
//	    else if(j<0) return output+i+1;
//	    else {
//	      char a = str1.charAt(i); 
//	      char b = str2.charAt(j); 
//	      if(a==b) {
//	    	  if(i<0) return output+j;
//	  	      else if(j<0) return output+i;
//	  	      output = moveOnTofollowChars(str1.substring(0,i), str2.substring(0,j), output);
//	      }        
//	      else {
//	    	  int res1;
//	    	  int res2;
//	  	    	res1 = moveOnTofollowChars(str1.substring(0,i+1), str2.substring(0,j), output+1);  	   	  	    
//	  	    	res2 = moveOnTofollowChars(str1.substring(0,i), str2.substring(0,j+1), output+1);
//	  	    
//	        output = Math.min(res1, res2);
//	      }
//	    }      
//	    return output;
//	  }
	  
	  static int moveOnTofollowChars(String str1, String str2, int output) {
	      int i = str1.length();
	      int j = str2.length();
	      
	      if(i==0 && j==0) return output;
	      if(i==0) return output+j;
	      if(j==0) return output+i;
	      
	      char a = str1.charAt(i-1);
	      char b = str2.charAt(j-1);
	      
	      if(a==b) {
	        if(i==0) return output+j;
	        if(j==0) return output+i;
	        output = moveOnTofollowChars(str1.substring(0,i-1), str2.substring(0,j-1),output);
	      }
	      else {
	        int res1 = moveOnTofollowChars(str1.substring(0,i), str2.substring(0,j-1),output+1);
	        int res2 = moveOnTofollowChars(str1.substring(0,i-1), str2.substring(0,j),output+1);
	        output = Math.min(res1,res2);
	      }
	      return output;
		  }
	    
	  public static void main(String[] args) {
		  String str1 = "abc";
		  String str2 = "abcd";
		  System.out.println(deletionDistance(str1, str2));
	  }

}
