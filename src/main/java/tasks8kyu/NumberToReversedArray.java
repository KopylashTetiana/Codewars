package main.java.tasks8kyu;

import java.util.Arrays;

/*
Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
 */
public class NumberToReversedArray {
    public static int[] digitize(long n) {
        String number = Long.toString(n);
        int[] digits = new int[number.length()];
        int index = number.length();
        for(char digit : number.toCharArray()) {
            digits[--index] = Character.getNumericValue(digit);
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(3156565L)));
        System.out.println(Arrays.toString(digitize(0L)));

    }
}
