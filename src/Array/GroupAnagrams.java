package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * String A와 B가 같은지 확인하여야함
 * 확인하는 방법1) A,B를 특정한 순서로 정렬하여 확인하는 방법
 * 확인하는 방법2) String A,B의 각 문자를 비교하는 방법
 */
public class GroupAnagrams {
	public static void main(String[] args) {
		String[] list =  {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(list));
	}

	private static List<List<String>> groupAnagrams(String[] list) {
		//결과를 담을 변수
		List<List<String>> resultList = new ArrayList<List<String>>();
		//정렬한 값과 list를 담을 변수
		Map<String,List<String>> map = new HashMap<String, List<String>>();
		//입력된 문자의 길이만큼 반복
		for(int i=0;i<list.length;i++) {
			char[] c=list[i].toCharArray();
			//정렬
			Arrays.sort(c);
			String b=String.valueOf(c);
			for(int j=0;j<c.length;j++) {
				b=b+c[j];
			}
			
			//정렬한 b가 map에 잇는지 확인
			if(!map.containsKey(b)) {
				//문자를 저장함
				List<String> strList = new ArrayList<String>();
				strList.add(list[i]);
				map.put(b, strList);
			}
			else {
				map.get(b).add(list[i]);
			}
		}
		//저장함
		resultList.addAll(map.values());
		return resultList;
	}

}
