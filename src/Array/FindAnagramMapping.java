package Array;

public class FindAnagramMapping {
	public static void main(String[] args) {
		int[] A = {11, 27, 45, 31, 50};
		int[] B = {50, 11, 31, 45, 27};
		int [] result = anagramMappings(A, B);
		print(result);
	}

	private static int[] anagramMappings(int[] a, int[] b) {
		int[] result = new int[a.length];
		//a의 값이 b와 같다면 그때 인덱스값을 출력한다.
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					result[i]=j;
				}
			}
		}
		return result;
	}
	private static void print(int[] result) {
		for(int num:result) {
			System.out.print(num+", ");
		}
	}
	
}
