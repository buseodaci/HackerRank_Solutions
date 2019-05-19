//Github :github.com/buseodaci

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x[] = new int[n];
		int XW = 0;
		int sum = 0;
		int w;
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			w = scan.nextInt();
			sum = sum + w;
			XW = XW + x[i] * w;
		}
		System.out.printf("%.1f\n", (float)XW / sum);
	}
}