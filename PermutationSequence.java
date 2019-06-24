package backtrack;

import java.util.ArrayList;

public class PermutationSequence {

	public static void main(String[] args) {
		int n = 5;
		int k = 26;
		// 2, 2 //5, 26 //3, 4 

		PermutationSequence ps = new PermutationSequence();
		System.out.println(ps.getPermutation(n, k));
	}

	public String getPermutation(int n, int k) {
		StringBuffer output = new StringBuffer("");

		if (n == 1 && k == 1)
			return "1";

		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++)
			nums.add(i);

		backtrack(n, nums, k, output, n, 0);

		return output.toString();
	}

	private void backtrack(int n, ArrayList<Integer> nums, int k, StringBuffer output, int start, int increment) {
		if (output.length() == n)
			return;

		if (start == 1) {
			getNext(nums, output, 0);
		}

		if (start > 1) {
			if (k <= fac(start - 1)) {
				getNext(nums, output, 0);
				backtrack(n, nums, k, output, start - 1, 0);
			} else {
				increment = k / fac(start - 1);
				k = k % fac(start - 1);
				if (k == 0) {
					output.append(nums.get(increment - 1));
					nums.remove(increment - 1);
					for (int i = nums.size() - 1; i >= 0; i--)
						output.append(nums.get(i));
					return;
				}
				getNext(nums, output, increment);
				backtrack(n, nums, k, output, start - 1, increment);
			}
		}
	}

	private void getNext(ArrayList<Integer> nums, StringBuffer output, int increment) {
		if (increment == 0) {
			output.append(nums.get(0));
			nums.remove(0);
		} else if (increment < nums.size()) {
			output.append(nums.get(increment));
			nums.remove(increment);
		} else if (increment == nums.size()) {
			output.append(nums.get(nums.size() - 1));
			nums.remove(nums.size() - 1);
		}
	}

	private int fac(int n) {
		if (n <= 2) {
			return n;
		}
		return n * fac(n - 1);
	}
	//int[] permute = new int[]{1,1,2,6,24,120,720,5040,40320};
}

/*class Solution {
    public String getPermutation(int n, int k) {
        if (n == 0){
            return new String();
        }
        char[] tmp = new char[n];
        int[] permute = new int[]{1,1,2,6,24,120,720,5040,40320};
        for (int i = 0; i < n; i++){
            tmp[i] = (char)(i + 1 + '0');
        }
        for (int i = 0; i < n; i++){
            int iGroup = (k - 1) / permute[n - 1 - i];
            char swp = tmp[i + iGroup];
            for (int j = i + iGroup; j > i; j--){
                tmp[j] = tmp[j - 1];
            }
            tmp[i] = swp;
            k -= iGroup * permute[n - 1 - i];
        } 
        return String.valueOf(tmp);
    }
}
*/
