package java_programmes;
/*11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany other alphabet should be invalid entry. */

import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {
city();
    }
        public static void city(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Alphabet: ");

            String a = sc.next();
            if (a.equalsIgnoreCase("a")) {
                System.out.println("Ahmednagar");
            } else if (a.equalsIgnoreCase("b")) {
                System.out.println("Bareliy");
            } else if (a.equalsIgnoreCase("c")) {
                System.out.println("Chandigarh");
            } else if (a.equalsIgnoreCase("d")) {
                System.out.println("Darjling");
            } else if (a.equalsIgnoreCase("e")) {
                System.out.println("Ernakulam");
            } else if (a.equalsIgnoreCase("f")) {
                System.out.println("Faizabad");
            } else
                System.out.println("Invalid Entry");
        }
    }


