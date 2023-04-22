package main.java.tasks6kyu;
/*
Complete the solution so that the function will break up camel casing, using a space between words.
Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""

 */
public class BreakCamelCase {
    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();
        for(char c : input.toCharArray()) {
            if(result.length() != 0  && Character.isUpperCase(c)) {
                result.append(' ');
            }
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase(""));
        System.out.println(camelCase("identifier"));
        System.out.println(camelCase("camelCasing"));
    }
}
