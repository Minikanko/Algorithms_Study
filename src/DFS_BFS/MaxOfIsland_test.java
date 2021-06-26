package DFS_BFS;

public class MaxOfIsland_test {
	public static void main(String[] args) {
		
    	
    	int[][] grid = 
    		            {
    		            {1,1,0,1,1},
    					{0,1,1,0,0},
    					{0,0,0,0,0},
    					{1,1,0,1,1},
    					{1,0,1,1,1},
    					{1,0,1,1,1}};
    	MaxOfIsland_test a = new MaxOfIsland_test();
    	System.out.println("답: "+a.maxAreaOfIsland(grid));
	}

	private int maxAreaOfIsland(int[][] grid) {
		int max=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]==1) {
					System.out.println(i+" "+j);
					max= Math.max(max, dfs(grid,i,j,0));
				}
			}
		}
		return max;
	}
	int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
	
	private int dfs(int[][] grid, int i, int j, int count) {
		int x = grid.length;
		int y = grid[0].length;
		
		if(i<0||j<0||i>=x||j>=y||grid[i][j]==0) 
			return count;
		grid[i][j]=0;
		count++;
		
		for(int[] dir : dirs) {
			System.out.println("전 i: "+i+" j: "+j);
			//int a = i+dir[0];
			//int b = j+dir[1];
			i+=dir[0];
			j+=dir[1];
			System.out.println("후 i: "+i+" j: "+j);
			count=dfs(grid,i,j,count);	
		}
		return count;
	}
}
