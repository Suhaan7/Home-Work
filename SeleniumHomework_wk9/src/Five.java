
//5. Write a Java program to test an array list is empty or not. Define array list with underground tube names

import java.util.ArrayList;

public class Five {

    public static void main(String[] args) {
        ArrayList<String> tubenames = new ArrayList<String>();
        tubenames.add("Picadilly");
        tubenames.add("Metropolitan");
        tubenames.add("Bakerloo");
        tubenames.add("Hammersmith & City");
        System.out.println(tubenames.isEmpty());

    }
}