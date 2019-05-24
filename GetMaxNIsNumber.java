import java.util.ArrayList;

public class GetMaxNIsNumber {
	
	public static void main(String [] args){
        String[] str = {"abc", "23", "-1", "2b", "", "*"};
        System.out.println(isDigital(str));
        long[] numbers = {2,14,6,7,8,-1};
        System.out.println(getMaxNumber(numbers));
 
    }
	
	public static long getMaxNumber(long[] numbers) {
        if(numbers.length==0) return 0;
        long max = numbers[0];
        for(int i=1; i<numbers.length; i++) {
        	if(numbers[i]>max) max=numbers[i];
        }
        return max;
    }

	 public static ArrayList<Boolean> isDigital (String[] str) {
		 ArrayList<Boolean> result = new ArrayList<Boolean>(); 
		 
		 for(int i=0; i<str.length; i++) {
			 try{
		            Integer a = Integer.parseInt(str[i]);
		            if (a !=null) result.add(true);
		        }catch(NumberFormatException exception){
		             result.add(false);
		        }
		 }
		 
		return result;
		 
	 }
}
