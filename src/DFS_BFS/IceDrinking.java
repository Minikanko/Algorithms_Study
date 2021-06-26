package DFS_BFS;

/*
 * 음료수 얼려 먹기
 * 
 * 문제)
 * N*M 크기의 얼음 틀이 있습니다. 구멍이 뚫려 있는 부분은 0, 칸막이가 존재하는 부분은 1로 표시됩니다.
 * 구멍이 뚫려 있는 부분끼리 상,하,좌,우로 붙어 있는 경우 서로 연결되어 있는 것으로 간주합니다.
 * 이때 얼음 틀의 모양이 주어졌을 때 생성되는 총 아이스크림의 개수를 구하는 프로그램을 작성하세요.
 * 
 * 접근방법:
 * DFS로 '0' 또는 방문한적이 없는 경우에는 그 지점을 중심으로 깊이 탐색하여 아이스크림 연결부분을 찾아낸다.
 */

import java.util.Scanner;

public class IceDrinking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] tempStr = scan.nextLine().split(" ");
		int x = Integer.parseInt(tempStr[0]);
		int y = Integer.parseInt(tempStr[1]);
		
		String[] strArr = new String[x];
		//입력받기
		for(int i=0;i<x;i++) {
			strArr[i]=scan.nextLine();
		}
		int count = 0;
		boolean[][] visited = new boolean[x][y]; 
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				if(strArr[i].charAt(j)=='0'&&!visited[i][j]) {
					dfs(strArr,visited,i,j,x);
					count++;
				}
			}
		}
		System.out.println(count);
		
		
	}
	
	public static void dfs(String[] strArr, boolean[][] visited,int i, int j, int size) {
		if(i>=size || j>=strArr[0].length() || visited[i][j] || strArr[i].charAt(j)=='1') 
			return;
		else {
			System.out.println(strArr[i].charAt(j)+" : "+i+","+j);
			visited[i][j] = true;
			dfs(strArr,visited,i+1,j,size);
			dfs(strArr,visited,i,j+1,size);
		}
	}

}
