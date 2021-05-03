package Graph;

import java.util.LinkedList;
import java.util.Queue;


public class Maze1_bfs {
	public static void main(String[] args) {

		int[][] maze = { { 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0 }, { 1, 1, 0, 1, 1 },
				{ 0, 0, 0, 0, 0 } };
		int[] start = { 0, 4 };
//		int[] dest = {4,4};
		int[] dest = { 3, 2 };
		Maze1_bfs a = new Maze1_bfs();
		System.out.println(a.hasPath(maze, start, dest));
	}
	int m,n;
	int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
	private boolean hasPath(int[][] maze, int[] start, int[] dest) {
		//wide한 지점을 담음
		Queue<int[]> q = new LinkedList<int[]>();
		m= maze.length;
		n= maze[0].length;
		//방문했는지 확인
		boolean[][] visited = new boolean[m][n];
		q.add(start);
		visited[start[0]][start[1]]=true;
		while(!q.isEmpty()) {
			int[] s = q.poll();
			for(int[] dir:dirs) {
				int x = s[0]+dir[0];
				int y = s[1]+dir[1];
				while(x>=0&&y>=0&&x<m&&y<n&&maze[x][y]==0) {
					x+=dir[0];
					y+=dir[1];
				}
				x-=dir[0];
				y-=dir[1];
				if(visited[x][y]) continue;
				visited[x][y]=true;
				q.add(new int[] {x,y});
				print(visited);
				System.out.println("=====");
				if(x==dest[0]&&y==dest[1])
					return true;
			}
			
		}
		
		
		return false;
	}
	public void  print(boolean[][] visited) {
		for(int i=0;i<visited.length;i++) {
			for(int j=0;j<visited[i].length;j++) {
				System.out.print(visited[i][j]+" ");
			}
			System.out.println();
		}
	}

	/*
	 1. 시작위치에서 목적지까지 가는데 목적지에서 멈출수있냐? 하는 질문
	 2. 방문한곳 표시, 다음수가 1인지 확인 
	 
	 */
	
}
