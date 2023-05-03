package java_homework_wk6;
/*18. Write a Java Program using below steps.
        18.1 Declare your council name as static variables.
        18.2 Declare your house number as instance variables.
        18.3 Declare one instance method name borough() and call Static variable  18.4 Declare static method name address() and call instance variable
        18.5 Call both user defined methods into main method.*/

public class Eighteen {

    static String councilname = "West Northamptonshire";
    int housenumber = 57;

    public void borough() {
        Eighteen e = new Eighteen();
        System.out.println(e.councilname);

    }

    public static void address(){
        Eighteen e = new Eighteen();
        System.out.println(e.housenumber);

        }

    public static void main(String[] args) {
        Eighteen e = new Eighteen();

        e.borough();
        address();
    }

}
