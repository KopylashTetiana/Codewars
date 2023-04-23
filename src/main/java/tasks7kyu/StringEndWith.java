package main.java.tasks7kyu;
/*
Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
 */
public class StringEndWith {
    public static boolean solution(String str, String ending) {
        int fromIndex = str.length() - ending.length();
        return (fromIndex >= 0) && (str.substring(fromIndex).equals(ending));
        //alternative solution, more simple than above:
        //return str.endsWith(ending);

    }

    public static void main(String[] args) {
        System.out.println(solution("abc", "bc"));
        System.out.println(solution("abc", "d"));
        System.out.println(solution("abc", "abcd"));
    }
}
