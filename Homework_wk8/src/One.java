
/*1. Read 10 numbers from the console entered by the user and print the sum of those
numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add itto the sum.
-Before the user enters each number, print the message Enter number #x: where x representsthe
count, i.e. 1, 2, 3, 4, etc.
-For example,the first message printed to the user would be Enter number #1:,the next Enter number
#2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.
*/
import java.util.Scanner;
public class One {

    public static void numbers(){
        int sum=0;
        int x =1;

        Scanner sc = new Scanner(System.in);
        while (x<=10){
            System.out.println("Enter Numbers " +x+" : ");
            if(sc.hasNextInt()){
                int a =sc.nextInt();
                sum+=a;
                x++;
            }
            else{
                System.out.println("False");
            }
            sc.nextLine();

            System.out.println(sum);

        }}
    public static void main(String[] args){
        numbers();
    }
}



