package main.java.tasks8kyu;
/*
 If you can't sleep, just count sheep!!
 Task:
 Given a non-negative integer, 3 for example, return a string with a murmur:
"1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
*/
public class CountSheep {
    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            result.append(i).append(" sheep...");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
        System.out.println(countingSheep(10));
        System.out.println(countingSheep(1));
    }
}
