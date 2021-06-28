package DFS_BFS;

import java.beans.Visibility;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 풀이
 * 해당 문제는 BFS 알고리즘으로 접근하면 될것같다.
 * 왜냐하면 익은 토마토 기준으로 주위에 있는 토마토는 같은날에 익을것이고 이 기간의 최소일수를 구하라고 하기때문에 넓은 탐색알고리즘을 사용하는것이 적합할것같다.
 */
public class BJ_7576 {
	private static final int[] x = { -1, 1, 0, 0 };
	private static final int[] y = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		boolean[][] visit = new boolean[M][N];

		scan.nextLine();
		int[][] board = new int[M][N];

		// 값 넣기
		for (int i = 0; i < M; i++) {
			String[] temp = scan.nextLine().split(" ");
			for (int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(temp[j]);
			}
		}
		int day = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == 1 && !visit[i][j]) {
					visit[i][j]=true;
					bfs(board, visit, i, j);
				}
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == 0) {
					System.out.println("-1");
					return;
				}
				day = Math.max(day, board[i][j]);
			}
		}
		System.out.println(day>0?day-1:day);
		

	}

	public static void bfs(int[][] board, boolean[][] visit, int i, int j) {

		Queue<int[]> q = new LinkedList<int[]>();

		q.add(new int[] { i, j });
		
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int nextX = 0;
			int nextY = 0;

			for (int z = 0; z < 4; z++) {
				nextX = cur[0] + x[z];
				nextY = cur[1] + y[z];
				if (nextX < 0 || nextY < 0 || nextX >= board.length || nextY >= board[0].length)
					continue;
				if (board[nextX][nextY] == -1 )
					continue;
				if (board[nextX][nextY] == 0 && !visit[nextX][nextY]) {
					visit[nextX][nextY] = true;
					board[nextX][nextY] = board[cur[0]][cur[1]] + 1;
					q.add(new int[] {nextX, nextY});
				}
			}
		}
	}

}
