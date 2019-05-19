//Github :github.com/buseodaci

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= x; i++) {
            s1 = scan.nextLine();
            write(s1.toCharArray());
        }
    }

    public static void write(char[] array) {
        int size = array.length;
        for (int i = 0; i < size; i += 2) {
            System.out.print(array[i]);
        }
        System.out.print(" ");
        for (int i = 1; i < size; i += 2) {
            System.out.print(array[i]);
        }
        System.out.println(" ");
    }
}