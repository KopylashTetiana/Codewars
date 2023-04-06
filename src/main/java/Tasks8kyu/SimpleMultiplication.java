package main.java.Tasks8kyu;
/*
This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
 */
public class SimpleMultiplication {
    public static int simpleMultiplication(int n) {
        return (n % 2 == 0) ? n * 8 : n * 9;
    }
    public static void main(String[] args) {
        System.out.println(simpleMultiplication(7));
        System.out.println(simpleMultiplication(2));
        System.out.println(simpleMultiplication(-1));
        System.out.println(simpleMultiplication(0));
        System.out.println(simpleMultiplication(10));
        System.out.println(simpleMultiplication(15));
    }
}
