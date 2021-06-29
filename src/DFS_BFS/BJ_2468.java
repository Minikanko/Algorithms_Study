package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2468 {
	private static final int[] x = { -1, 1, 0, 0 };
	private static final int[] y = { 0, 0, -1, 1 };
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		scan.nextLine();
		int[][] board = new int[N][N];
		
		// 값 넣기
		for (int i = 0; i <N; i++) {
			for (int j = 0; j<N; j++) {
				board[i][j] = scan.nextInt();
			}
		}

		int result = 1;		//비가 아예 안올수도 있기 때문에
		
		for(int s=1;s<=99;s++) {		//비의 높이
			boolean[][] visit = new boolean[N][N];	//방문여부
			int count = 0;		//안전영역 개수
			for (int i = 0; i <N; i++) {
				for (int j = 0; j<N; j++) {
					if(!visit[i][j]&&board[i][j]>s) {
						visit[i][j] = true;
						bfs(board, visit, i, j, s);
						count++;
					}
				}
			}
			result = Math.max(result, count);	//안전영역 최대값
		}
		System.out.println(result);
	}
	public static void bfs(int[][] board,boolean[][] visit, int i,int j,int h) {
		Queue<int[]> q = new LinkedList<int[]>();
		
		q.add(new int[] {i,j});
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			for(int z=0;z<4;z++) {
				int nextX = cur[0]+x[z];
				int nextY = cur[1]+y[z];
				if(nextX<0 || nextY<0 || nextX>=board.length || nextY>=board[0].length) continue;
				if(visit[nextX][nextY] || board[nextX][nextY]<=h) continue;
				visit[nextX][nextY] = true;
				q.add(new int[] {nextX,nextY});
			}
			
		}
	}
}
