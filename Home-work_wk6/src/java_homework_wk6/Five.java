package java_homework_wk6;

/*5. Write a program for a calculator with addition, subtraction, multiplication, and division  methods all with parameters and use string concatenation methods. (Note: Two static  and Two instance methods.)  */
public class Five {

int a = 50;
int b = 100;

public void addition(){
    System.out.println( " The addition of :" + (a+b));

}
public void subtraction(){
    System.out.println( " The subtraction of :" + (a-b));

}
public static void multiplication (){
    Five f = new Five();
    System.out.println( " The multiplication of :" + ((f.a)*(f.b)));

}
public static void division () {
    Five f = new Five();
    System.out.println( " The division of :" + ((f.a)/(f.b)));

}

    public static void main(String[] args) {
        Five f = new Five();

        f.addition();
        f.subtraction();
        division();
        multiplication();

    }
}
