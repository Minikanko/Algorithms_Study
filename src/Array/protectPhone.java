package Array;

public class protectPhone {
    public static void main(String[] args) {
        String result = solution("01033606946");
        System.out.println(result);
    }

    public static String solution(String phone_number) {

        char[] ch = phone_number.toCharArray();
        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }



        return String.valueOf(ch);
    }
}
