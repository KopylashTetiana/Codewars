package main.java.Tasks8kyu;
/*
 Write a function that accepts an integer n and a string s as
parameters, and returns a string of s repeated exactly n times.
 */
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(3, "Hou"));
    }
}