package climbingWays;

public class GetClimbingWays2 {

	public static void main(String[] args) {
		int a = 10;
	//	long startTime = System.nanoTime();  
		long startTime = System.currentTimeMillis();
		System.out.println(getClimbingWays(a));
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println(estimatedTime);

	}
	
	static int getClimbingWays (int n) {
		if(n<1){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if(n==2){
			return 2;
		}
		
		return getClimbingWays(n-1) + getClimbingWays(n-2);
	
	}

}
