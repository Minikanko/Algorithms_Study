package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

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
public class NumberOfIsland_bfs {

	public static void main(String[] args) {
		char[][] grid= {
				{'1','1','0','0','1'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'},
				{'1','0','0','1','1'}
			   };
		NumberOfIsland_bfs a = new NumberOfIsland_bfs();
		System.out.println(a.solve(grid));
	}
	
	public int solve(char[][] grid) {
		int count =0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]=='1') {
					count++;
					bfs(grid,i,j);
				}
			}
		}
		return count;
	}
	int[][] dirs= {{-1,0},{1,0},{0,-1},{0,1}};
	private void bfs(char[][] grid, int i, int j) {
		//체크하는 지점저장
		Queue<int[]> q = new LinkedList<int[]>();
		grid[i][j]=0;
		q.add(new int[]{i,j});
		while(!q.isEmpty()) {
			int[] temp = q.poll();
			for(int[] dir:dirs) {
				int x = temp[0]+dir[0];
				int y = temp[1]+dir[1];
				if(x>=0&&y>=0&&x<grid.length&&y<grid[0].length&&grid[x][y]=='1') {
					grid[x][y]='0';
					q.add(new int[] {x,y});
				}
			}
		}
	}
	
}
