package Array;
/*
You are given a license key represented as a string S which consists only alphanumeric character and dashes. The string is separated into N+1 groups by N dashes.
Given a number K, we would want to reformat the strings such that each group contains exactly K characters, except for the first group which could be shorter than K, but still must contain at least one character. Furthermore, there must be a dash inserted between two groups and all lowercase letters should be converted to uppercase.
Given a non-empty string S and a number K, format the string according to the rules described above.
input
String str = "8F3Z-2e-9-w";
String str = "8-5g-3-J";
int k =4;
Output : 8F3Z-2E9W 8F3Z-2E9W, 8-5G3J

1.하이픈제거, 대문자
2.끝에서 4자리 끊기 String, StringBuffer, StringBuilder 차이점과 장단점. 
1. String + 연산이나 concat을 -> 새로운 String객체를 new로 만듦 
2. StringBuffer, 멀티쓰레드홖경에서는 synchronized 
3. StringBuilder asynchronized 싱글쓰레드 홖경
*/

public class LicenseKeyFormatting {
	public static void main(String[] args) {

		String S = "5F3Z-2e-9-w";
		String str = "8-5g-3-J";
		int k = 2;
		System.out.println(licenseKeyFormatting(S, k));
	}

	private static StringBuilder licenseKeyFormatting(String str, int k) {
		String strRepl=str.replace("-", "").toUpperCase();
		StringBuilder sb = new StringBuilder();
		int size = strRepl.length();
		sb.append(strRepl);
		for(int i=k;i<size;i=i+k) {
			sb.insert(size-i, '-');
		}
		return sb;
	}
	
/*
한번만 -이 생성됨(오답)
	private static String licenseKeyFormatting(String s, int k) {
		String strRepl = s.replace("-", "").toUpperCase();
		String result="";
		int count=0;
		for(char a:strRepl.toCharArray()) {
			if(count==strRepl.length()-k) {
				result=result+"-";
			}
			count++;
			result=result+a;
		}
		return result;
	}
 */
}
