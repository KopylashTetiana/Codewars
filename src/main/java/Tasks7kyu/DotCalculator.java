package main.java.Tasks7kyu;
/*
 You have to write a calculator that receives strings for input.
The dots will represent the number in the equation. There will be dots
on one side, an operator, and dots again after the operator. The dots
and the operator will be separated by one space.
 Here are the following valid operators :
 + Addition
 - Subtraction
 * Multiplication
 // Integer Division
 Your Work (Task)
 You'll have to return a string that contains dots, as many the equation
returns. If the result is 0, return the empty string. When it comes to
subtraction, the first number will always be greater than or equal to
the second number.
 Examples (Input => Output)
 * "..... + ..............." => "...................."
 * "..... - ..."             => ".."
 * "..... - ."               => "...."
 * "..... * ..."             => "..............."
 * "..... * .."              => ".........."
 * "..... // .."             => ".."
 * "..... // ."              => "....."
 * ". // .."                 => ""
 * ".. - .."                 => ""
*/
public class DotCalculator {
    public static String calc(String txt){
        String[] equation = txt.split(" ");
        int result;
        switch (equation[1]) {
            case "+": result = equation[0].length() + equation[2].length(); break;
            case "-": result = equation[0].length() - equation[2].length(); break;
            case "*": result = equation[0].length() * equation[2].length(); break;
            default : result = equation[0].length() / equation[2].length(); break;
        }
            return ".".repeat(result);
    }

    public static void main(String[] args) {
        System.out.println(calc("..... + ..............."));
        System.out.println(calc("..... - ..."));
        System.out.println(calc("..... - ."));
        System.out.println(calc("..... * ..."));
        System.out.println(calc("..... * .."));
        System.out.println(calc("..... // .."));
        System.out.println(calc("..... // ."));
        System.out.println(calc(". // .."));
        System.out.println(calc(".. - .."));
        System.out.println("The End");
    }
}
