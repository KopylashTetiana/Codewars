package main.java.tasks7kyu;

import java.util.Arrays;
/*
Write a program that outputs the top n elements from a list.
Example:
largest(2, new int[]{7, 6, 5, 4, 3, 2, 1})
// => new int[]{6, 7}
 */
public class LargestElements {
    public static int[] largest(int n, int[] arr) {
        Arrays.sort(arr);
        int [] result = new int[n];
        for(; n > 0; n--) {
            result[result.length - n] = arr[arr.length - n];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(largest(2, new int[]{7, 6, 5, 4, 3, 2, 1})));
    }
}
