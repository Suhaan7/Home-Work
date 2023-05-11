package java_programmes;

import java.util.Scanner;

public class Six {

          public static void main(String[] args)
        {
            double basicSalary,HRA,DA,PF,TA,Gross;
            String eId,eName;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter employee Id:");
            eId = sc.next();
            System.out.println("Enter employee Name:");
            eName = sc.next();
            System.out.println("Basic salary");
            basicSalary = sc.nextDouble();

            HRA=(basicSalary*10)/100;
            DA = (basicSalary*8)/100;
            TA = (basicSalary*9)/100;
            PF=  (basicSalary*20)/100;
            Gross = basicSalary+TA+HRA+DA-PF;

            System.out.println("|-------------------------|");
            System.out.println("|      Salary Slip        |");
            System.out.println("|-------------------------|");
            System.out.println("| Employee Id   : "+eId+" |");
            System.out.println("| Employee Name : "+eName+" |");
            System.out.println("|------------------------- |");
            System.out.println("| Basic Salary  : "+basicSalary+" |");
            System.out.println("| HRA 10%       : "+HRA+"  |");
            System.out.println("| TA 8%         : "+TA+"   |");
            System.out.println("| DA 9%         : "+DA+"   |");
            System.out.println("| PF - 20%      : "+PF+"   |");
            System.out.println("|--------------------------|");
            System.out.println("| Gross Salary  : "+Gross+"|");
            System.out.println("|==========================|");
        }
    }


