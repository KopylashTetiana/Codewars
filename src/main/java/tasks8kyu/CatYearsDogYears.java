package main.java.tasks8kyu;

/*
I have a cat and a dog.
I got them at the same time as kitten/puppy. That was humanYears years ago.
Return their respective ages now as [humanYears,catYears,dogYears]
NOTES:
humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
* */
public class CatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 15;
        int dogYears = 15;
        if (humanYears > 2){
            catYears += 9 + (humanYears - 2) * 4;
            dogYears += 9 + (humanYears - 2) * 5;
        } else if(humanYears > 1) {
            catYears += 9;
            dogYears += 9;
        }
        return new int[] {humanYears, catYears, dogYears};
    }
    public static String arrayToString(int[] array) {
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
    int[] humanCatDogYears = humanYearsCatYearsDogYears(10);
        System.out.println(arrayToString(humanCatDogYears));
    }
}
