package climbingWays;

public class GetClimbingWays1 {

	public static void main(String[] args) {
		int a = 10;
//		long startTime = System.nanoTime();  
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
		
		int a= 1;
		int b = 2;
		int temp = 0;
		
		for(int i=3; i<=n; i++){
			temp = a+b;
			a=b;
			b=temp;
		}
		return temp;
	
	}

}
