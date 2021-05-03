package Array;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
/*
Every email consists of a local name and a domain name, separated by the @ sign.
For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
Besides lowercase letters, these emails may contain '.'s or '+'s.
If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address. (Note that this rule does not apply for domain names.)
If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com. (Again, this rule does not apply for domain names.)
It is possible to use both of these rules at the same time.
Given a list of emails, we send one email to each address in the list. How many different addresses actually receive mails?
ex)
Input: [ "test.email+james@coding.com", "test.e.mail+toto.jane@coding.com", "testemail+tom@cod.ing.com"] 
Output: 2 
"testemail@coding.com" "testemail@cod.ing.com"
*/
public class UniqueEamilAddress {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com", "bcgrhji.dl@naver.com", "bcg+rhji.dl@naver.com",
				"bcgrhji.asddl@naver.com" };
		System.out.println(numUniqueEmailsCount(emails));
		long end = System.currentTimeMillis();
		System.out.println("소요시간: " + (end - start));
	}

	private static int numUniqueEmailsCount(String[] emails) {
		// 중복값을 가지지 않는 collections 중에는 map과 set이 있는데 이경우에서는 map보다는 set이 낫다
		// Map<String, Integer> map = new HashMap<String, Integer>();
/*
 첫번째 풀이법: 메소드를 분할하지 않고 한 메소드에서 localName과 domainName을 처리함
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < emails.length; i++) {
			String[] split = emails[i].split("@");
			StringTokenizer st = new StringTokenizer(split[0], ".");
			StringBuilder sb = new StringBuilder();
			while (st.hasMoreTokens()) {
				String current = st.nextToken();
				if (current.contains("+")) {
					current = current.substring(0, current.indexOf("+"));
					sb.append(current);
					break;
				}
				sb.append(current);
			}
			set.add(sb.toString() + "@" + split[1]);
		}
		System.out.println(set.toString());
		return set.size();
s*/

		Set<String> set = new HashSet<String>();
		for (String email : emails) {
			String[] split = email.split("@");
			String localName = localName(split[0]);
			String domainName = split[1];
			set.add(localName + "@" + domainName);
		}
		System.out.println(set.toString());
		return set.size();

	}

	private static String localName(String email) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '.')
				continue;
			else if (email.charAt(i) == '+')
				break;
			else {
				sb.append(email.charAt(i));
			}
		}
		return sb.toString();
	}

}
