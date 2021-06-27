package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 풀이 : BFS 최단거리를 구하는 문제
 */
public class BJ_2178 {
	private static final int[] x = { -1, 1, 0, 0 };
	private static final int[] y = { 0, 0, -1, 1 };
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		scan.nextLine();
		int[][] board = new int[N+1][M+1];
		
		// 값 넣기
		for (int i = 1; i <=N; i++) {
			String[] temp = scan.nextLine().split("");
			for (int j = 1; j <=M; j++) {
				board[i][j] = Integer.parseInt(temp[j-1]);
			}
		}
		bfs(board, N, M);
		
		
	}
	
	public static void bfs(int[][] board,int N,int M) {
		Queue<int[]> q = new LinkedList<int[]>();
		
		q.add(new int[] {1,1});
		while(!q.isEmpty()) {
			int[] cul = q.poll();
			for(int i=0;i<4;i++) {
				int nextX = cul[0]+x[i];
				int nextY = cul[1]+y[i];
				
				if(nextX<0 || nextY<0 || nextX>N || nextY>M) continue;
				if(board[nextX][nextY] == 0) continue;
				if(board[nextX][nextY] == 1) {
					board[nextX][nextY] = board[cul[0]][cul[1]]+1;
					q.add(new int[] {nextX,nextY});
				}
			}
		}
		
		System.out.println(board[N][M]);
		
		
	}

}
