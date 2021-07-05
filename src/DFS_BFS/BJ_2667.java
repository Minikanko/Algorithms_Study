package DFS_BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Stream;

public class BJ_2667 {
	private static final int[] x = { -1, 1, 0, 0 };
	private static final int[] y = { 0, 0, -1, 1 };
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		String[] map = new String[N];
		
		for(int i =0;i<N;i++) {
			map[i]= scan.nextLine();
		}
		boolean[][] visited = new boolean[N][N];
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(map[i].charAt(j)=='1'&&!visited[i][j]) {
					visited[i][j]=true;
					list.add(bfs(map, visited, i, j));
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		list.stream().forEach(x->System.out.println(x));
	}
	public static int bfs(String[] map, boolean[][] visited,int i,int j) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {i,j});
		int count=1;
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			for(int t =0;t<4;t++) {
				int nextX= cur[0]+x[t];
				int nextY= cur[1]+y[t];
				
				if(nextX<0||nextY<0||nextX>=map.length||nextY>=map.length) continue;
				if(visited[nextX][nextY]||map[nextX].charAt(nextY)=='0') continue;			
				visited[nextX][nextY]=true;
				q.add(new int[] {nextX,nextY});
				count++;
			}
		}
		return count;
	}

}
