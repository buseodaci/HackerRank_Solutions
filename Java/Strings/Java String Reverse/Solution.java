//Github :github.com/buseodaci
import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String reverseA = "";
		int length = A.length();
		for (int i = length - 1; i >= 0; i--) {
			reverseA = reverseA + A.charAt(i);
		}
		if (reverseA.equals(A)) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}
