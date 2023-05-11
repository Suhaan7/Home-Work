package java_programmes;

import java.util.Arrays;

//21. Write a Java program to sum values of an array. //
public class TwentyOne {

    static int i []= {77,82,19,21};
    public static void main(String[] args) {

int a[] = new int[4];

        a[0]=77;
        a[1]=82;
        a[2]=19;
        a[3]=21;

        System.out.println(Arrays.stream(i).sum());

    }

}
