package main.java.Tasks8kyu;
/*
Write a function that removes the spaces from the string, then return the resultant string.
Examples:
Input -> Output
"8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
"8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
"8aaaaa dddd r     " -> "8aaaaaddddr"
 */
public class RemoveStringSpaces {
    public static String noSpace(final String x) {
        String [] noSpaces = x.split(" ");
        StringBuilder result = new StringBuilder();
        for(String part : noSpaces) {
            result.append(part);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        System.out.println(noSpace("8aaaaa dddd r     "));
    }
}