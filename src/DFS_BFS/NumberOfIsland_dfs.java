package DFS_BFS;
/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
	Example 1:
	Input:
	11110
	11010
	11000
	00000
	Output: 1
	Example 2:
	Input:
	11000
	11000
	00100
	00011
	Output: 3
	
	DFS:깊이 우선탐색
*/
public class NumberOfIsland_dfs {
	public static void main(String[] args) {
		char[][] grid= {
						{'1','1','1','0','0'},
						{'1','1','0','0','0'},
						{'0','0','1','0','1'},
						{'0','0','0','1','1'}
					   };
		
		NumberOfIsland_dfs a = new NumberOfIsland_dfs();
		System.out.println(a.numsIslands(grid));
	}

	//1. 1이 있으면 동서남북에 1이 또 있는지 확인
	//2. 확인 후 해당 1을 왔다갔다고 표시함
	private int numsIslands(char[][] grid) {
		int count=0;
		if(grid==null || grid.length==0) return 0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]=='1') {
					count++;
					checkVisited(grid,i,j);
					System.out.println("변경");
				}
			}
		}
		
		return count;
	}

	private void checkVisited(char[][] grid, int i, int j) {
		int xSize = grid.length;
		int ySize = grid[0].length;
		//만약 grid의 사이즈를 벗어나거나 1이 아니라면 종료
		if(i<0 || j<0 || i>=xSize || j>=ySize || grid[i][j]!='1') return;
		//방문한 지점은 X로 변경
		grid[i][j]='X';
		
		//동서남북으로 재귀함수 호출
		checkVisited(grid,i-1,j);
		checkVisited(grid,i+1,j);
		checkVisited(grid,i,j-1);
		checkVisited(grid,i,j+1);
		print(grid);
	}
	//출력함수
	public void print(char[][] grid) {
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
}
