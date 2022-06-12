package Array;

import java.util.HashSet;

/*
1. nums의 길이를 구한다. 거기서 n/2를 구한다
2. 그리고 중복값을 뺀다
 */
public class phoneMonster {
    public static void main(String[] args) {

    }

    public static int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        answer = set.size() > nums.length ? nums.length : set.size();

        return answer;
    }
}
