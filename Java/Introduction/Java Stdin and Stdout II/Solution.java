//Github :github.com/buseodaci
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		String s = "";
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		while (scan.hasNextLine()) {
			s = scan.nextLine();
		}
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}