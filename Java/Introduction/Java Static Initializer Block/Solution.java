//Github :github.com/buseodaci
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static int B, H;
	static boolean flag;
	static {
		Scanner scanner = new Scanner(System.in);
		B = scanner.nextInt();
		H = scanner.nextInt();
		if (B <= 0 || H <= 0) {
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		} else {
			flag = true;
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}
}