package java_homework_wk6;
/*19. Write a Java Program using below steps.
 19.1 Declare one of your group member names as instance variable.
 19.2 Declare one of your group member names as static variable.
 19.3 Declare one instance method name with group name (e.g. selenium())and call both global  variables.
 19.4 Declare static method name agile() and call both variable
 19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement
*/
public class Nineteen {

    String name = "Kruti";
    static String name1 = "Nimit";

    public void java() {
        System.out.println(name);
        System.out.println(name1);
    }
        public static void agile() {
            Nineteen n = new Nineteen();
            System.out.println(n.name);
            System.out.println(name1);

        }
    public static void main(String[] args) {
        Nineteen n = new Nineteen();
        n.java();
        agile();
    }
        }





