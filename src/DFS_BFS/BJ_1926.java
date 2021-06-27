package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_1926 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		scan.nextLine();
		int[][] board = new int[N][M];

		// 값 넣기
		for (int i = 0; i < N; i++) {
			String[] temp = scan.nextLine().split(" ");
			for (int j = 0; j < M; j++) {
				board[i][j] = Integer.parseInt(temp[j]);
			}
		}
		bfs(board, N, M);

	}

	private static int[] x = { -1, 1, 0, 0 };
	private static int[] y = { 0, 0, -1, 1 };

	public static void bfs(int[][] board, int N, int M) {

		int picWidth = 0;
		int picCount = 0;
		boolean[][] visit = new boolean[N][M];

		Queue<int[]> q = new LinkedList<int[]>();

		for (int a = 0; a < N; a++) {
			for (int b = 0; b < M; b++) {
				if (board[a][b] == 1 && !visit[a][b]) {
					q.add(new int[] { a, b });
					picCount++;
					visit[a][b] = true;
					int picSize=1;

					while (!q.isEmpty()) {
						int[] cul = q.poll();
						int nextX = -1;
						int nextY = -1;
						for (int i = 0; i < 4; i++) {
							nextX = cul[0] + x[i];
							nextY = cul[1] + y[i];
							if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
								continue;
							if (board[nextX][nextY] == 0)
								continue;
							if (board[nextX][nextY] == 1 && !visit[nextX][nextY]) {
								visit[nextX][nextY] = true;
								board[nextX][nextY] = board[cul[0]][cul[1]]+1;
								picSize++;
								q.add(new int[] { nextX, nextY });
								
							}
						}
					}
					picWidth = Math.max(picWidth, picSize);
				}
			}
		}
		System.out.println(picCount);
		System.out.println(picWidth);

	}
}
