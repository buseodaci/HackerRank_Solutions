//Github :github.com/buseodaci
import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (scanner.hasNext())    {
			i++;
			String sentence = scanner.nextLine();
			System.out.println(i + " " + sentence);
		}
	}
}