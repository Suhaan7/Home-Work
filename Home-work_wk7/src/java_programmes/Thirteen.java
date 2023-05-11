package java_programmes;

import java.util.Scanner;

//Write a java program to input any two number and ask user to enter their symbol (+, -, /, *) find addition, Subtraction, multiplication and division according to theirsymbol(using if else)//
public class Thirteen {

    public static void Calculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        double a = sc.nextInt();
        System.out.println(a);
        System.out.println("Enter number 2 : ");
        double b = sc.nextInt();
        System.out.println(b);
        System.out.println("Enter symbol ");
        String symbol = sc.next();
        if (symbol.equals("+")) {
            System.out.println("Addition = " + (a + b));
        } else if (symbol.equals("-")) {
            System.out.println("Subtraction = " + (a - b));
        } else if (symbol.equals("/")) {
            System.out.println("Division = " + (a/b));
        } else if (symbol.equals("*")) {
            System.out.println("Multiplication = " + (a*b));
        }
        else {
            System.out.println("Enter valid symbol : +, -, /, *");
        }
    }
        public static void main (String[]args) {

Calculation();
        }
    }


