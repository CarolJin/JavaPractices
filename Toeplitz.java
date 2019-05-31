// check whether given matrix is a Toeplitz matrix or not 

public class Toeplitz {
	public static int N = 5;
	public static int M = 4;

	// Function to check if all elements present in
	// descending diagonal starting from position
	// (i, j) in the matrix are all same or not
	static boolean checkDiagonal(int mat[][], int i, int j) {
		int res = mat[i][j];
		while (++i < N && ++j < M) {
			if (mat[i][j] != res)
				return false;
		}

		return true;
	}

	static boolean isToepliz(int mat[][]) {
		for (int i = 0; i < M; i++) {
			if (!checkDiagonal(mat, 0, i))
				return false;
		}

		for (int i = 1; i < N; i++) {
			if (!checkDiagonal(mat, i, 0))
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		int mat[][] = { { 6, 7, 8, 9 }, { 4, 6, 7, 8 }, { 1, 4, 6, 7 }, { 0, 1, 4, 6 }, { 2, 0, 1, 4 } };

		if (isToepliz(mat))
			System.out.println("Matrix is a Toepliz ");
		else
			System.out.println("Matrix is not a Toepliz ");
	}
}
