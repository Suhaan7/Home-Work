package java_programmes;

/*11. Input any alphabet from “A" to “F” and print their city name accordingly (switch statement) if any other alphabet should be invalid entry. */

import java.util.Scanner;

public class Twelve {

    public static void main(String[] args) {

        city();

           }

    public static void city() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any alphabet from A to F : ");
        char city = sc.next().charAt(0);

        switch (city) {

            case 'A':
                System.out.println("Vadodara");
                break;
            case 'B':
                System.out.println("Ahmedabad");
                break;
            case 'C':
                System.out.println("Mumbai");
                break;
            case 'D':
                System.out.println("Chandigarh");
                break;
            case 'E':
                System.out.println("Jaipur");
                break;
            case 'F':
                System.out.println("Hyderabad");
                break;
            default:
                System.out.println("Invalid Input");
        }
        city();


    }
}


