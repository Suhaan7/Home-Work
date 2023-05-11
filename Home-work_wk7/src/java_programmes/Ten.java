package java_programmes;

/*Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
        Commission
        Sales amount >= 50,000 35%
        Sales amount >= 30,000 20%
        >= 20,000 10%
        >= 10,000 5%
< 10,000 2%*/

import java.util.Scanner;

public class Ten {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount:");
        double amount=sc.nextDouble();
        System.out.print("Enter commissionPercentage:");
        double commissionPercentage=sc.nextDouble();
        double commission=(commissionPercentage/100)*amount;
        System.out.println("Commission amount="+commission);
    }
}
