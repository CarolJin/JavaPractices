public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean exist(char[][] board, String word) {
		if (board != null && !word.isEmpty() && board.length != 0 && board[0].length != 0) {
			char w = word.charAt(0);
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					if (board[i][j] == w && dfs(board, word, i, j, 0)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean dfs(char[][] board, String word, int x, int y, int index) {
		if (index == word.length())
			return true;

		if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != word.charAt(index))
			return false;

		char c = board[x][y];
		board[x][y] = '0';
		if (dfs(board, word, x + 1, y, index + 1) || dfs(board, word, x - 1, y, index + 1)
				|| dfs(board, word, x, y + 1, index + 1) || dfs(board, word, x, y - 1, index + 1))
			return true;

		board[x][y] = c;
		return false;
	}
}
