//Github :github.com/buseodaci

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println(findMedian(array, 0, array.length / 2 - 1));
        System.out.println(findMedian(array, 0, array.length - 1));
        System.out.println(findMedian(array, (array.length + 1) / 2, array.length - 1));
    }

    public static int findMedian(int array[], int start, int end) {
        if ((end - start) % 2 == 0) {
            return (array[(end + start) / 2]);
        } else {
            return Math.round((array[(end + start) / 2] + array[(end + start) / 2 + 1]) / 2);
        }
    }
}

