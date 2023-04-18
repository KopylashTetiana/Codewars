package main.java.Tasks7kyu;
/*
Write a function titleToNumber(title) that given a column title as it appears in an Excel
sheet, returns its corresponding column number. All column titles will be uppercase.
Examples:
titleTonumber('A') === 1
titleTonumber('Z') === 26
titleTonumber('AA') === 27
Note for Clojure:
Don't use Java Math/pow (even with bigint) because there is a loss of precision
when the length of "title" is growing.
Write your own function "exp [x n]".
 */
public class TitleToNumber {
    public static long titleToNumber(String title) { //char - 64
        long index = 0;
        long pow = 1;
        for(int i = title.length(); i > 0; i--) {
            index += (title.charAt(i - 1) - 'A' + 1) * pow;
            pow *= 26;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("Z"));
        System.out.println(titleToNumber("AA"));

    }
}
