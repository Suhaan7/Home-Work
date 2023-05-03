package java_homework_wk6;
/*20. Write a Java Program using below steps.
 20.1 Declare your Spain as static variable.
 20.2 Declare your United Kingdom as instance variable.
 20.3 Declare instance method name homeCountry()and call static variable. */
public class Twenty {

    static String country = "Spain";
    String country1 = "UK";

    public void homeCountry(){
     Twenty t = new Twenty();
        System.out.println(t.country);
    }

    public static void holidays(){
        Twenty t = new Twenty();
        System.out.println(t.country1);

    }

    public static void main(String[] args) {
        Twenty t = new Twenty();
        t.homeCountry();
        holidays();

    }

}
