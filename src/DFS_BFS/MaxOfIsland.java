package DFS_BFS;

public class MaxOfIsland {
	public static void main(String[] args) {
		
    	
    	int[][] grid = 
    		            {
    		            {1,1,0,1,1},
    					{0,1,1,0,0},
    					{0,0,0,0,0},
    					{1,1,0,1,1},
    					{1,0,1,1,1},
    					{1,0,1,1,1}};
    	MaxOfIsland a = new MaxOfIsland();
    	System.out.println(a.maxAreaOfIsland(grid));
	}

	private int maxAreaOfIsland(int[][] grid) {
		if(grid==null || grid[0]==null || grid.length==0 || grid[0].length==0) return 0;
		int max=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j] == 1) {
					int area = bfs(grid,i,j,0);
					System.out.println(area);
					 max = Math.max(max, area);
				}
			}
		}
		return max;
	}
	int[][] dirs = {{1,0},{-1,0},{0,-1},{0,1}};
	int bfs(int[][] grid, int i, int j,int count) {
		if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0) 
			return count;
		grid[i][j]=0;
		count++;
		for(int[] dir:dirs) {
			int x = dir[0]+i;
			int y = dir[1]+j;
			count = bfs(grid,x,y,count);
		}
		return count;
	}
}
