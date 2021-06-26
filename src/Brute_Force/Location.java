package Brute_Force;

/* 상하좌우
 * 
 * 문제)
 * 여행가 A는 N*N 크기의 정사각형 공간 위에 서 있습니다. 이 공간은 1*1 크기의 정사각형으로 나누어져 있습니다.
 * 가장 왼쪽 위 좌표는 (1,1)이며, 가장 오른쪽 아래 좌표는 (N,N)에 해당합니다. 여행가 A는 상,하,좌,우 방향으로 이동 할 수 있으며,
 * 시작 좌표는 항상 (1,1)입니다. 우리 앞에는 여행가 A가 이동할 계획이 적힌 계획서가 놓여 있습니다.
 * L : 왼쪽으로 한 칸 이동
 * R : 오른쪽으로 한 칸 이동
 * U : 위로 한 칸 이동
 * D : 아래로 한 칸 이동
 */

import java.util.Scanner;

public class Location {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		String command = scan.nextLine().trim();
		
		char[] comnType = {'L','R','D','U'};
		int[] x = {0,0,1,-1};
		int[] y = {-1,1,0,0};
		int startX = 1;
		int startY = 1;
		
		for(int i=0;i<command.length();i++) {
			for(int t=0;t<comnType.length;t++) {
				if(command.charAt(i)==comnType[t]) {
					startX +=x[t];
					startY +=y[t];
					if(startX<1 || startY<1 ||startX>N||startY>N) {
						startX -=x[t];
						startY -=y[t];
						continue;
					}
				}
					
			}
		}
		System.out.println(startX+" "+startY);
		
	}

}
