package Tasks8kyu;

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
    public static int[] sort(int[] arr) {
        int[] sortedArr = arr.clone();
            for (int i = 0, j = i; i < sortedArr.length - 1; j = ++i) {
                int next = sortedArr[i + 1];
                while (next < sortedArr[j]) {
                    sortedArr[j + 1] = sortedArr[j];
                    if (j-- == 0) {
                        break;
                    }
                }
                sortedArr[j + 1] = next;
            }
        return sortedArr;
    }
    public static int[] flip(char dir, int[] arr) {
        int[] flip;
        if (dir == 'R') {
            flip = sort(arr);
        } else {
            flip = arr.clone();
            for (int i = (flip.length - 1), j = i; i >= 0; j = --i) {
                int next = flip[i - 1];
                while (next < flip[j]) {
                    flip[j - 1] = flip[j];
                    if (j++ == 0) {
                        break;
                    }
                }
                flip[j - 1] = next;
            }
        }
            return flip;

    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {5, 6, -10, 8, 1, 2, 0};
        int[] arr1Sort = flip('R', arr1);
        for (int i : arr1Sort) {
            System.out.println(i);
        }

    }
}
