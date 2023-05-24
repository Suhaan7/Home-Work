//4. Write a Java program to iterate through all elements in an array list using Iterator.

import java.util.ArrayList;
import java.util.Iterator;

public class Four {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Nissan");
        cars.add("Renault");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Chevrolet");


        Iterator<String> i = cars.iterator();
        while (i.hasNext()) {
            System.out.print(i.next());
            System.out.println(",");
        }

    }}


