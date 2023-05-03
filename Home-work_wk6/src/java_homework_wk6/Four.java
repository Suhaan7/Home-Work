package java_homework_wk6;

/* 4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.  */

public class Four {

    int i = 7;
    double d = 10.5;
    static char c = 'S';
    static String s = "Java";


    public void m1() {
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);

    }
     public static void m2(){

        Four f = new Four();
         System.out.println(f.i);
         System.out.println(f.d);
         System.out.println(c);
         System.out.println(s);
     }

    public static void main(String[] args) {
        Four f = new Four();

        f.m1();
        m2();
    }
}
