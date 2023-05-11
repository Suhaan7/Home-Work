package java_programmes;


import java.util.Arrays;

public class Twenty {

    public static void main(String[] args) {

        int[] i = {52,67,34,79,12,65,3,43};
        String[] s = {"shivaay","rudra","hardik","shweta"};

        Arrays.sort(i);
        System.out.println("Sorted value for numbers: " + Arrays.toString(i));
        Arrays.sort(s);
        System.out.println("Sorted value for String: " + Arrays.toString(s));

    }

}
