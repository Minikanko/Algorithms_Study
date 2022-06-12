package Array;

import java.util.Arrays;
/*
    1. 자기가 찌른 사람의 카운팅을 세고
    2. 그  사람이 count 기준으로 실제 정지대상인지 확인
    3. 다시 내가 신고한 ID가 해당 사용자인지 확인
 */
public class Declaration {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] declationCount = new int[id_list.length];
        int[][] count = new int[id_list.length][id_list.length];

        for (String s : report) {
            String[] temp = s.split(" ");
            count[search(id_list,temp[0])][search(id_list,temp[1])]++;
        }

        for(int i=0; i<id_list.length;i++){
            int num = 0;
            for(int j=0; j< id_list.length;j++){
                if(count[i][j] != 0){
                    num++;
                }
            }
            if(num>=k) {
                declationCount[i] = num;
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        String[] id = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        int[] result = solution(id, report, k);
        printArr(result);
    }

    public static void printArr(int[] input) {
        for (int n : input) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int search(String[] data, String item) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                index = i;
            }
        }
        return index;
    }
}
