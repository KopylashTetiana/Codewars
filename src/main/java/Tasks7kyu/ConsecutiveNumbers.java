package main.java.Tasks7kyu;

import java.util.Arrays;
/*
Create the function consecutive(arr) that takes an array of integers and return
the minimum number of integers needed to make the contents of arr consecutive
from the lowest number to the highest number.
For example:
If arr contains [4, 8, 6] then the output should be 2 because two numbers need
to be added to the array (5 and 7) to make it a consecutive array of numbers
from 4 to 8. Numbers in arr will be unique.
 */
public class ConsecutiveNumbers {
    public static int consecutive(final int[] arr) {
        if(arr.length == 0) return 0;
        Arrays.sort(arr);
        return (arr[arr.length - 1] - arr[0] - arr.length + 1);
    }

    public static void main(String[] args) {
        System.out.println(consecutive(new int[]{}));
        System.out.println(consecutive(new int[] {4, 8, 6}));
        System.out.println(consecutive(new int[] {6, 4, 7, 1, 9}));
    }
}
