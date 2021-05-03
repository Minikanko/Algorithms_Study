package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllAnagrams {
	public static void main(String args[])
    {
		FindAllAnagrams a = new FindAllAnagrams();
        String txt = "BACDGABCDA";
        String pat = "ABCD";
        System.out.println(a.findAnagrams(txt, pat));
    }

	private List<Integer> findAnagrams(String txt, String pat) {
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<txt.length();i++) {
			//pat의 인덱스 번호/문자
			int location = pat.indexOf(txt.charAt(i));
			//pat에도 있는 문자이면서 set에 추가한적이 없는 문자
			if(location>=0&&!set.contains(location)) {
				set.add(location);
				//만약set에 pat의 문자개수만큼 찼다면 list에 추가한다.
				if(set.size()==pat.length()) {
					list.add(i-pat.length()+1);
					i=i-pat.length()+1;
					set.clear();
				}
			}
			else {
				set.clear();
			}
		}
		return list;
	}
}
