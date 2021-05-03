package Array;
/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.
Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
*/
public class PlusOne {

	public static void main(String[] args) {
		long a=System.currentTimeMillis();
		int[] digits = {9,9,9};
		int[] result = plusOne(digits);
		for (int i : result)
			System.out.println("val: " + i);
		long b=System.currentTimeMillis();
		System.out.println("소요시간: "+(b-a));
	}
/*
풀이법1번
1) 배열에 끝번호에 +1를 함
2) 끝번호+1 했을때 10을 넘어가는지 체크
3) 자릿수가 증가하는경우에 대해 처리하기
*/
	private static int[] plusOne(int[] digits) {
		int index = digits.length-1;
		int plus=1;
		while(index>=0&&plus!=0) {
			digits[index]=(digits[index]+plus)%10;
			//10보다 작은 수여서 다음자릿수에 1를 하지 않아도 되는경우
			if(digits[index]!=0) {
				plus=0;
			}
			--index;
		}
		if(plus==1) {
			digits=new int[digits.length+1];
			digits[0]=1;
		}
		return digits;
	}
	

/* 
풀이법2번
1) 각 배열에 있는 숫자를 하나의 숫자로 만듬
2) 그 숫자+1
3) 문자열로 변환하여 다시 생성
평균 소유시간:1~2	 
	private static int[] plusOne(int[] digits) {
		int result=0;
		for(int i=0;i<digits.length;i++) {
			result=(int) (result+digits[i]*Math.pow(10, digits.length-i-1));
		}
		result+=1;
		
		String[] str = Integer.toString(result).split("");
		int[] a = new int[str.length];
		for(int i=0;i<str.length;i++) {
			a[i] = Integer.parseInt(str[i]);
		}
		return a;
	}
*/

}
