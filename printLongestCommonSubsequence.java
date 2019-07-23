import java.io.*;
import java.math.*;
import java.util.*;

public class printLongestCommonSubsequence {

    // Complete the longestCommonSubsequence function below.
    static int[] longestCommonSubsequence(int[] a, int[] b) {
        if(a.length==0 || b.length==0) return new int[0];

        int m = a.length;
        int n = b.length;
        int dp[][] = new int[m+1][n+1];

        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                if(i==0 && j==0) 
                 dp[i][j] = 0;
                else if((i-1)>=0 && (j-1)>=0) {
                    if(a[i-1]== b[j-1])
                        dp[i][j] = dp[i-1][j-1]+1;
                    else
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }                
            } 
        }

        int len = dp[m][n];
        int[] res = new int[len];
        int index =len-1;

        int x =m;
        int y =n;
        while(x>0 && y>0) {
            if(a[x-1]==b[y-1]) {
                res[index--] = a[x-1];
                x--;
                y--;
            }
            else if(dp[x-1][y]>dp[x][y-1]) 
             x--;
            else 
             y--;
        }

        return res;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b[i] = bItem;
        }

        int[] result = longestCommonSubsequence(a, b);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
