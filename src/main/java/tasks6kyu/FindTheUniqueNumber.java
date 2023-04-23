package main.java.tasks6kyu;

/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!
FindTheUniqueNumber.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
FindTheUniqueNumber.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.
The tests contain some very huge arrays, so think about performance.
 */
public class FindTheUniqueNumber {
    public static double findUniq(double[] arr) {
        final double repeatedNum = arr[(arr[0] == arr[1] ? 0 : 2)];
        for(double num : arr) {
            if(num != repeatedNum) {
                return num;
            }
        }
        throw new RuntimeException("There is no unique number in the array");
    }

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }));
        System.out.println(findUniq(new double[]{ 0, 0, 0.55, 0, 0 }));
    }
}
