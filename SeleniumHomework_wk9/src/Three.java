//. Write a Java program to create a new array list, add some colours(string) and printout the collection using for each loop.//

import java.util.ArrayList;

public class Three {

    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Orange");
        colours.add("Purple");

               for (String s:colours){
             {
                 System.out.println(s);
             }
            
        }
    }

}
