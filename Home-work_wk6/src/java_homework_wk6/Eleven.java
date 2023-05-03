package java_homework_wk6;
/*Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))*/

public class Eleven {

    double a = 25.5;
    double b = 3.5;
    double c = 40.5;
    double d = 4.5;


    public static void main(String[] args) {
        Eleven e = new Eleven();

        System.out.println(((e.a * e.b) - (e.b * e.b)) / (e.c - e.d));

    }
}
