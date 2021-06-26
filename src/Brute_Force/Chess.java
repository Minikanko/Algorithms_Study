package Brute_Force;

import java.util.Scanner;

/*
 * 왕실의 나이트
 * 
 * 문제) 
 * 행복 왕국의 왕실 정원은 체스판과 같은 8*8 좌표 평면입니다. 왕실 정원의 특정한 한 칸에 나이트가 서 있습니다.
 * 나이트는 매우 충성스러운 신하로서 매일 무술을 연마합니다.
 * 나이트는 말을 타고 있기 댐누에 이동을 할 때는 L자 형태로만 이동할 수 있으며 정원 밖으로는 나갈 수 없습니다.
 * 나이트는 특정위치에 다음과 같은 2가지 경우로만 이동할 수 있습니다.
 * 
 * 1. 수평으로 두칸 이동한뒤에 수직으로 한칸 이동하기
 * 2. 수직으로 두칸 이동한 뒤에 수평으로 한칸 이동하기
 * 행은 숫자, 열은 a~h로 주어짐
 */

public class Chess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int[][] locationType = { { 1, 2 }, { 1, -2 }, { -1, 2 }, { -1, -2 }, { 2, -1 }, { 2, 1 }, { -2, -1 },
				{ -2, 1 } };

		int startX = str.charAt(0) - 'a' + 1;
		int startY = Integer.parseInt(str.charAt(1) + "");
	
		int count = 0;
		for (int x = 0; x < locationType.length; x++) {
			int locationX=startX;
			int locationY=startY;
			locationX += locationType[x][0];
			locationY += locationType[x][1];
			if (locationX < 1 || locationY < 1 || locationX > 8 || locationY > 8) {
				continue;
			}
			count++;
		}
		System.out.println(count);
	}

}
