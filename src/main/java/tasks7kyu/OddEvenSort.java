package main.java.tasks7kyu;

/*
Given a string s. You have to return another string such that even-indexed and odd-indexed
characters of s are grouped and groups are space-separated (see sample below)
Note:
0 is considered to be an even index.
All input strings are valid with no spaces
input: 'CodeWars'
output 'CdWr oeas'

S[0] = 'C'
S[1] = 'o'
S[2] = 'd'
S[3] = 'e'
S[4] = 'W'
S[5] = 'a'
S[6] = 'r'
S[7] = 's'
Even indices 0, 2, 4, 6, so we have 'CdWr' as the first group
odd ones are 1, 3, 5, 7, so the second group is 'oeas'
And the final string to return is 'Cdwr oeas'
 */
public class OddEvenSort {
    public static String sortMyString(String s) {
        char[] sortChars = new char[s.length() + 1];
        for(int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sortChars[i / 2] = s.charAt(i);
            } else {
                sortChars[(s.length() + i) / 2 + 1] = s.charAt(i);
            }
        }
        sortChars[(s.length() + 1) / 2] = ' ';
        return new String(sortChars);
    }

    public static void main(String[] args) {
        System.out.println(sortMyString("hghghghg"));
        System.out.println(sortMyString("hghghgh"));
        System.out.println(sortMyString("CodeWars"));
    }
}
