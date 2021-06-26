package DFS_BFS;

public class WordSearch {
	public static void main(String[] args) {
		char[][] grid = { 
				{ 'A', 'B', 'C', 'E' }, 
				{ 'S', 'F', 'C', 'S' }, 
				{ 'A', 'D', 'E', 'E' } };
		String word = "ABCCEDASF";
		WordSearch a = new WordSearch();
		System.out.println(a.solve(grid, word));
	}

	// dfs
	/*
	 * 문자 찾기
	 * 방문지점 표시
	 * 
	 */
	private boolean solve(char[][] grid, String word) {
		if(word==null||word.length()==0) return false;
		int x = grid.length;
		int y = grid[0].length;
		boolean[][] visited = new boolean[x][y];
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]==word.charAt(0)) {
					if(dfs(grid,visited,i,j,word,0))
						return true;
				}
			}
		}
		return false;
	}

	int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	private boolean dfs(char[][] grid, boolean[][] visited ,int i, int j, String word,int index) {
		int x = grid.length;
		int y = grid[0].length;
		
		if(index==word.length()) return true;
		if(i<0||j<0||i>=x||j>=y||grid[i][j]!=word.charAt(index)) return false;
		if(visited[i][j]) return false;
		visited[i][j] = true;
	
		
		
		for(int[] dir : dirs) {
			int a=i+dir[0];
			int b=j+dir[1];
			System.out.println(a+" "+b+" "+word.charAt(index));
			print(visited);
			System.out.println("--------");
			if(dfs(grid,visited,a,b,word,++index))
				return true;
			--index;
		}
		//visited[i][j]=false;
		return false;
	}
	
	public void print(boolean[][] visi) {
		for(int i=0;i<visi.length;i++) {
			for(int j=0;j<visi[i].length;j++) {
				System.out.print(visi[i][j]+" ");
			}
			System.out.println();
		}
	}
}
