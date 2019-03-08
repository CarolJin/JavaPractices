package printCertainModels;
/**
 * 
 * @author ljin2
 *     1   
 *    121
 *   12321
 *  1234321
 *
 */

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 4;
		int n = 0;
		int rowNo = 1;
		
		for(int i=1; i<=l; i++){
			for(int m=1; m<=i;m++){
				if(m<=rowNo){
				n=n+1;
				}
				else{
					n-=1;
				}
				System.out.print(n);
				rowNo+=2;
			}
			System.out.println("");
		}
	}

}
