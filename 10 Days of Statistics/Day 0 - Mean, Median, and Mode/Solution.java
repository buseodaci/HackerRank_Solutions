//Github :github.com/buseodaci

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float array[] = new float[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println(findMean(array));
        System.out.println(findMedian(array));
        System.out.println(findMode(array));
    }

    public static float findMean(float arr[]) {
        int size = arr.length;
        float total = 0;
        float mean = 0;
        for (int i = 0; i < size; i++) {
            total = total + arr[i];
        }
        mean = total / size;
        return mean;
    }

    public static float findMedian(float arr[]) {
        int size = arr.length;
        float median = 0;
        if (size % 2 == 0) {
            median = ((arr[size / 2]) + (arr[(size / 2) - 1])) / 2;
        } else {
            median = (arr[size - 1]) / 2;
        }
        return median;
    }

    public static float findMode(float arr[]) {
        int size = arr.length;
        float smallestValue = 0;
        int smallestCount = 0;
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > smallestCount) {
                smallestCount = count;
                smallestValue = arr[i];
            }
        }
        return smallestValue;
    }
}
