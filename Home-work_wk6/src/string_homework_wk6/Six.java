package string_homework_wk6;

public class Six {

    /*Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java*/


    public static void main(String[] args) {

        String s = "I@love@java";
       System.out.println(s.replaceAll("I@love@java", "We love java"));

    }

}
