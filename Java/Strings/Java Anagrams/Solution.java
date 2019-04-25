//Github :github.com/buseodaci
import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String a, String b) {
		String copyA = a.replaceAll("\\s", "").toLowerCase();
		String copyB = b.replaceAll("\\s", "").toLowerCase();
		boolean status = true;
		if (a.length() != b.length()) {
			status = false;
		} else {
			char[] aArray = copyA.toCharArray();
			for (char c : aArray) {
				int index = copyB.indexOf(c);
				if (index != -1) {
					copyB = copyB.substring(0, index) + copyB.substring(index + 1, copyB.length());
					status = true;
				} else {
					status = false;
				}
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}