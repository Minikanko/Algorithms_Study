package DFS_BFS;

import java.util.Arrays;
import java.util.List;

public class WordLadder_re {
	public static void main(String[] args) {
		String[] words = {"hot","dot","lot","log","cog"};
//		String[] words = {"hot","dot","dog","lot","log"};
		List<String> wordList = Arrays.asList(words);
//		Set<String> dict = new HashSet<>(wordList);
		WordLadder_re a = new WordLadder_re();
		System.out.println(a.ladderLength_neighbor("hit","cog", wordList));
	}

	private char[] ladderLength_neighbor(String string, String string2, List<String> wordList) {
		return null;
	}
}
