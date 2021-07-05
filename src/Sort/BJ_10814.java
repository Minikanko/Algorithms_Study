package Sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BJ_10814 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		List<String[]> list = new ArrayList<String[]>();
		scan.nextLine();

		for (int i = 0; i < T; i++) {
			list.add(scan.nextLine().split(" "));
		}

		Collections.sort(list, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				int a = Integer.parseInt(o1[0]);
				int b = Integer.parseInt(o2[0]);

				if (a == b)
					return 0;
				else {
					return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				}
			}

		});
		for (int i = 0; i < T; i++)
			System.out.println(list.get(i)[0] + " " + list.get(i)[1]);

	}

}
