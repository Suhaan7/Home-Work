
//6. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets. Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)

import java.util.HashSet;

public class Six {

    public static void main(String[] args) {

        HashSet<Integer> number = new HashSet<>();
        number.add(4);
        number.add(7);
        number.add(8);


        for (int i : number) {

            if (i <= 10 || i >= 0) {
                System.out.println(i);
            } else {
                System.out.println("Not Found");
            }
        }
    }}