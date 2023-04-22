package main.java.tasks7kyu;

/*
Write a function insertDash(int num) that will insert dashes ('-') between
each two odd digits in num. For example: if num is 454793 the output should
be 4547-9-3. Don't count zero as an odd digit.
Note that the number will always be non-negative (>= 0).
 */
public class InsertDashes {

    public static String insertDash(int num) {
        return String.valueOf(num).replaceAll("[13579](?=[13579])", "$0-");
    }

    public static String insertDash2(int num) {
        String number = Integer.toString(num);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < number.length(); i++) {
            if(i > 0 && (int)number.charAt(i - 1) % 2 != 0 && (int)number.charAt(i) % 2 != 0) {
                result.append("-");
            }
            result.append(number.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(insertDash(454793));
        System.out.println(insertDash2(454793));
        System.out.println(insertDash(1547942693));
        System.out.println(insertDash2(1547942693));
        System.out.println(insertDash(0));
        System.out.println(insertDash2(0));
        System.out.println(insertDash(1));
        System.out.println(insertDash2(1));
        System.out.println(insertDash(11));
        System.out.println(insertDash2(11));
    }
}
