package Tasks8kyu;
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
        String tail = arr[0];
        arr[0] = arr[2];
        arr[2] = tail;
        return arr;
    }
    public static void main(String[] args) {
    String[] arr = fixTheMeerkat(new String[] {"tail", "body", "head"});
    for(String bodyPart : arr) {
        System.out.println(bodyPart);
    }

    }
}
