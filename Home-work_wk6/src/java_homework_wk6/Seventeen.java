package java_homework_wk6;
/*17. Write a Java Program using below steps.
        17.1 Declare your city as instance variables.
        17.2 Declare your country as static variables.
        17.3 Declare one instance method and call static variable in print statement
        17.4 Declare static method and call instance variable in print Statement.
        17.5 Call both user defined methods into main method.*/

public class Seventeen {

    String city = "Northampton";
    static String country = "UK";

    public void m1() {
        Seventeen s = new Seventeen();
        System.out.println(s.country);
    }
        public static void m2 (){
        Seventeen s = new Seventeen();
            System.out.println(s.city);

    }

    public static void main(String[] args) {
        Seventeen s = new Seventeen();
        s.m1();
        m2();

    }

}
