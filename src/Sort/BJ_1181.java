package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class BJ_1181 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.nextLine();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            list.add(scan.nextLine());
        }

        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        list.stream().distinct().forEach(x -> System.out.println(x));
    }

}
