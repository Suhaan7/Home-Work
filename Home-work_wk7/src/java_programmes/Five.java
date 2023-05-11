package java_programmes;

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("|       Mark Sheet       |");
        marksheet();
    }

    public static void marksheet() {
        String subject1 = "| Maths :           |", subject2 = "| Science :        |", subject3 = "| English :        |", subject = "| Subject :        ", name = "| Name :                  |", roll = "| Roll No :              |", total = "| Total Marks :            |";
        String percentage = "| Percentage :               |";
        String result = "| Result :";
        String Grade = "| Grade :";
        double ot = 300d; //Total marks for all subjects


        Scanner student = new Scanner(System.in);
        System.out.println(name);
        while (student.hasNextInt()) {
            System.out.println("Invalid Entry");
            System.out.println("Enter the name again :");
            student.next();
        }
        System.out.println("|-------------------------|");
        String R = student.next();
        System.out.println(roll);
        student.next();
        System.out.println(subject);
        student.next();
        System.out.println(subject2);
        int marks = student.nextInt();

        if (marks <= 100) {
            System.out.println("Valid");
        } else {
            System.out.println("invalid entry");
            student.next();
        }
        System.out.println(subject1);
        int Mat = student.nextInt();
        if (Mat <= 100) {
            System.out.println("Valid");
        } else {
            System.out.println("invalid entry");
            student.next();
        }
        System.out.println(subject3);
        int Eng = student.nextInt();
        if (Eng <= 100) {
            System.out.println("Valid");
        } else {
            System.out.println("invalid entry");
            student.next();
        }
        System.out.println("|-------------------------|");
        System.out.println(total);
        int TM = marks + Mat + Eng;
        System.out.println(TM);
        System.out.println("|-------------------------|");
        System.out.println(percentage);
        double i = TM * 100 / ot;

        System.out.println(i);
        System.out.println(result);
        if (i >= 99) {
            System.out.println("Pass with Grade A+");
        } else if (i <= 80 && i >= 70) {
            System.out.println("Pass with Grade A");
        } else if (i <= 70 && i >= 50) {
            System.out.println("Pass with Grade B");
        } else if (i <= 50 && i >= 35) {
            System.out.println("Pass with Grade C");
        } else {
            System.out.println("FAIL");
            student.next();
        }
        System.out.println("|-------------------------|");


    }
}