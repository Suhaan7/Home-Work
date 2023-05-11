package java_programmes;

import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol. //
public class Fifteen {

    public static void main(String[] args) {
bf();

    }

        public static void bf(){
            Scanner sc = new Scanner(System.in);
            System.out.println( "Enter any  number or an alphabet or Symbol: ");
            char sm = sc.next().charAt(0);
            String sd = "a" ,  ds="z";
            if((sm >= 'a' && sm <= 'z')){
                System.out.println("The input you have entered is Character:");}
            else if (sm >= '0' && sm <= '9') {
                System.out.println("The input you have entered is Number:");
            } else{
                System.out.println("The input you have entered is Symbol:");

            }


        }
    }
