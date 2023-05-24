package calculate_java_homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Calculator c = new Calculator();
        System.out.println("Enter firstnumber");
        int a = sc.nextInt();
        System.out.println("Enter secondnumber");
        int b = sc.nextInt();
        System.out.println("Enter symbol");
        char symbol = sc.next().charAt(0);
        c.calculateResult(a,b,symbol);

        if (symbol=='+'){
            c.addition(a,b);
        } else if (symbol=='-') {
            c.subtraction(a,b);
        } else if (symbol=='/') {
            c.division(a,b);
        } else if (symbol=='*') {
            c.multiplication(a,b);
        }else
            System.out.println("Invalid");
    }
}
