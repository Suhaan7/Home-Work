package calculate_java_homework;

public class Calculator {

    static int result;

    public void addition(int a, int b) {
        System.out.println(a + b);
    }

    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    public void division(int a, int b) {
        System.out.println(a / b);
    }

    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    public int calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            result = a + b;
            return result;
        } else if (symbol=='-') {
result = a-b;
return result;
        } else if (symbol=='/') {
            result = a/b;
            return result;
        } else if (symbol=='*') {
            result = a*b;
            return result;
        }
        else {
            return a;
        }
    }}

