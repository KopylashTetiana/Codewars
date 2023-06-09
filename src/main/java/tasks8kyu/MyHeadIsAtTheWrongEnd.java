package main.java.tasks8kyu;
/*
 You're at the zoo... all the meerkats look weird. Something has gone terribly wrong -
someone has gone and switched their heads and tails around!
 Save the animals by switching them back. You will be given an array which will have
three values (tail, body, head). It is your job to re-arrange the array so that the
animal is the right way round (head, body, tail).
 Same goes for all the other arrays/lists that you will get in the tests: you have to
 change the element positions with the same exact logics.
 */
public class MyHeadIsAtTheWrongEnd {
    public static String[] fixTheMeerkat(String[] arr) {
        return new String[]{arr[2], arr[1], arr[0]};
    }
    public static String arrayToString(String [] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
    String[] arr = fixTheMeerkat(new String[] {"tail", "body", "head"});
    System.out.println(arrayToString(arr));
    }
}
