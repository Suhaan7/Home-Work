package java_homework_wk6;
/*Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/
public class Fourteen {
    public static void main(String[] args) {

        int i = 125;
        int j = 24;

        System.out.println("125 + 24 = " + (i+j));
        System.out.println("125 - 24 = " + (i-j));
        System.out.println("125 x 24 = " + (i*j));
        System.out.println("125 / 24 = " + (i/j));
        System.out.println("125 mod 24 = " + (i%j) );



    }


}
