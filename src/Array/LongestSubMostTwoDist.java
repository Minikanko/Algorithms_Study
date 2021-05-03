package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Given a string s , find the length of the longest substring t that contains at most 2 distinct characters.
문자종류가 최대 2개로 이루어진 문자열의 최대길이를 구하라
Example 1:
Input: "eceba"
Output: 3
Explanation: t is "ece" which its length is 3.
Example 2:
Input: "ccaabbb"
Output: 5
Explanation: t is "aabbb" which its length is 5.
*/
public class LongestSubMostTwoDist {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String s = "ccaabbb";
		System.out.println(lengthOfLongestSubstringTwoDistinct(s));
		long end = System.currentTimeMillis();
		System.out.println("소요시간: "+(end-start));
	}
	private static int lengthOfLongestSubstringTwoDistinct(String s) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 1;
		for(int i=1;i<s.length();i++) {
			char beforeChar = s.charAt(i-1);
			char currentChar = s.charAt(i);
			//한번들어간 문자에 대해 count++
			if(beforeChar==currentChar) {
				count++;
			}
			else {
				list.add(count);
				count=1;
			}
		}
		list.add(count);
		int max=0;
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i)+list.get(i+1)>max) {
				max = list.get(i)+list.get(i+1);
			}
		}
		return max;
	}
	
	
/*
	 public static int lengthOfLongestSubstringTwoDistinct(String s) {
	        Map<Character,Integer> map = new HashMap<>();
	        //count=문자갯수
	        int start = 0, end = 0, counter = 0, len = 0;
	        while(end < s.length()){
	            char c = s.charAt(end);
	            map.put(c, map.getOrDefault(c, 0) + 1);
	            System.out.println(map.toString());
	            if(map.get(c) == 1) {
	            	counter++;//new char
	            	System.out.println(start+" "+end+" "+counter);
	            }
	            end++;
	            while(counter > 2){
	                char cTemp = s.charAt(start);
	                map.put(cTemp, map.get(cTemp) - 1);
	                if(map.get(cTemp) == 0){
	                    counter--;
	                }
	                start++;
	            }
	            len = Math.max(len, end-start);
	        }
	        return len;
	    }
*/
}
