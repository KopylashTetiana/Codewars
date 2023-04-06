package main.java.Tasks8kyu;

/*
 Bob is bored during his physics lessons, so he's built himself a toy box to help
pass the time. The box is special because it has the ability to change gravity.
 There are some columns of toy cubes in the box arranged in a line. The i-th column
contains a_i cubes. At first, the gravity in the box is pulling the cubes downwards.
When Bob switches the gravity, it begins to pull all the cubes to a certain side of
the box, d, which can be either 'L' or 'R' (left or right). Below is an example of
what a box of cubes might look like before and after switching gravity.
+---+                                       +---+
|   |                                       |   |
+---+                                       +---+
+---++---+     +---+              +---++---++---+
|   ||   |     |   |   -->        |   ||   ||   |
+---++---+     +---+              +---++---++---+
+---++---++---++---+         +---++---++---++---+
|   ||   ||   ||   |         |   ||   ||   ||   |
+---++---++---++---+         +---++---++---++---+
 Given the initial configuration of the cubes in the box, find out how many cubes are
in each of the n columns after Bob switches the gravity.
Examples (input -> output:
* 'R', [3, 2, 1, 2]      ->  [1, 2, 2, 3]
* 'L', [1, 4, 5, 3, 5 ]  ->  [5, 5, 4, 3, 1]
 */
public class GravityFlip {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
        /* Пересуваємо елементи масиву, які більше за ключ,
        на одну позицію вправо */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static int[] flip(char dir, int[] arr) {
        sort(arr);
        if (dir == 'L') {
            int rotation;
            for (int i = 0; i < arr.length / 2; i++) {
                rotation = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = rotation;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 6, -10, 8, 1, 2, 0};
        int[] flipRight = flip('R', arr);
        for (int i : flipRight) {
            System.out.println(i);
        }
        int[] flipLeft = flip('L', arr);
        for (int i : flipLeft) {
            System.out.println(i);
        }
    }
}
