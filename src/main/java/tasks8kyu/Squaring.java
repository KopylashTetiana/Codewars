package main.java.tasks8kyu;
/*
Now you have to write a function that takes an argument and returns the square of it.
 */
public class Squaring {
    public static int square(int n){
        return n * n;
    }

    public static void main(String[] args) {
        System.out.println(square(10));
        System.out.println(square(1));
        System.out.println(square(3));
        System.out.println(square(0));
    }
}
