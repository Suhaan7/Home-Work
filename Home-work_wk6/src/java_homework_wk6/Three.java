package java_homework_wk6;
/*3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
3.5 Declare the Main method.
 3.6 Call both instance and static methods into the Main method and run the programme.*/

public class Three {

    int i = 100;
    static String s = "QA Testing";

    public void m1() {
        System.out.println(i);
        System.out.println(s);
    }
        public static void m2 () {
            Three t = new Three();
            System.out.println(t.i);
            System.out.println(s);
        }

        public static void main (String[]args){
            Three t = new Three();

            t.m1();
            m2();
        }

    }

