package main.java.tasks8kyu;
/*
 Your task is to find the nearest square number, nearest_sq(n)
or nearestSq(n), of a positive integer n.
 For example, if n = 111, then nearest\_sq(n) (nearestSq(n))
equals 121, since 111 is closer to 121, the square of 11, than
100, the square of 10.
 If the n is already the perfect square (e.g. n = 144, n = 81,
etc.), you need to just return n.
 */
public class NearestSquareNumber {
    public static int nearestSq(final int n){
        int squareRoot = (int)Math.sqrt(n);
        if(n - Math.pow(squareRoot, 2) <= Math.pow(squareRoot + 1, 2) - n) {
            return (int)Math.pow(squareRoot, 2);
        } else return (int)Math.pow(squareRoot + 1, 2);
    }

    public static void main(String[] args) {
        System.out.println(nearestSq(111));
        System.out.println(nearestSq(144));
        System.out.println(nearestSq(0));
        System.out.println(nearestSq(81));
    }
}
