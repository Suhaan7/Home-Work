package java_programmes;
/* Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)*/
public class One {

    int a = 200, b = 100;// Declared Instance variables in global area

    int x = a>b ? a:b; //Syntax of Ternary operators ?:  and stored it into variable x

    public static void main(String[] args) {
        One o=new One(); // Declared object to call instance variables into main method
        System.out.println(o.x);//Called through object
    }

}
