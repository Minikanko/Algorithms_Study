package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * BFS 알고리즘 사용
 * Visited 사용
 */
public class BJ_1012 {
	private static final int[] x = { -1, 1, 0, 0 };
	private static final int[] y = { 0, 0, -1, 1 };
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-- > 0) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			int K = scan.nextInt();
			boolean[][] visit = new boolean[N][M];
			int count = 0;
			int[][] board = new int[N][M];
			
			while(K-- >0) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				board[x][y] = 1;
			}
			for(int i =0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(board[i][j]==1 && !visit[i][j]) {
						count++;
						visit[i][j] =true;
						bfs(board, visit, i, j);
					}
				}
			}
			System.out.println(count);
		}
	}
	

	public static void bfs(int[][] board, boolean[][] visit, int i, int j) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {i,j});
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			for(int z=0;z<4;z++) {
				int nextX = cur[0]+x[z];
				int nextY = cur[1]+y[z];
				if(nextX<0 || nextY<0 || nextX>=board.length || nextY>=board[0].length) continue;
				if(board[nextX][nextY]!=1 || visit[nextX][nextY]) continue;
				visit[nextX][nextY] = true;
				q.add(new int[] {nextX,nextY});
			}
		}

	}

}
