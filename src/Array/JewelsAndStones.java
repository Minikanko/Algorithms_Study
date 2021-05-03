package Array;

import java.util.HashSet;
import java.util.Set;

/*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have. 
Each character in S is a type of stone you have. You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so "a" is considered a different type of stone from "A".
보석갯수, 스톤갯수, letter 대소문자 구분
Input: J = "aA", S = "aAAbbbb” Output: 3
*/
public class JewelsAndStones {
	public static void main(String args[]) {
		String J = "aA", S = "aAAbbbb";
		System.out.println(solve(J, S));
	}
	
	private static int solve(String j, String s) {
		int count=0;
		Set<Character> set = new HashSet<Character>();
		for(char a :j.toCharArray()) {
			set.add(a);
		}
		for(char b :s.toCharArray()) {
			if(set.contains(b)) {
				count++;
			}
		}
		return count;
	}

}
