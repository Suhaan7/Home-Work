package java_programmes;
//Declare one method with return type and parameter and print your name in console.//
public class TwentyFive {

    String name = "Shweta";
    public static String TwentyFive (String name) {
        TwentyFive t = new TwentyFive();
        return t.name;
        }

        public static void main (String[]args){


            System.out.println("My name is :" + TwentyFive("Shweta"));
        }
    }
