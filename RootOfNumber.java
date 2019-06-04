public class RootOfNumber {
	public static void main(String[] args) {
	      double x = 200;
	      int n = 5;
	      System.out.println("The root is: " + root(x, n));
	  }
	
	public static double root(double x, int n) {
	      
	      double start = 1;
	      double end = x; // 27, 14
	      while(true) {
	        double mid = start+ (end-start)/2; // 14, 7.5
	        if(Math.abs(x - Math.pow(mid,n))<0.001) return mid;
	        else if(x>Math.pow(mid,n)) {
	           start= mid;
	              }
	        else if(x<Math.pow(mid,n)) { // x << 14^3, 7.5^3
	           end= mid;
	              }
	      }
	  }
}
