//7. Create a HashMap object called people that will store String keys and Integer values: And use for each loop to iterate the value from Map.

import java.util.HashMap;
import java.util.Iterator;

public class Seven {

    public static void main(String[] args) {
        HashMap<String,Integer> people = new HashMap<>();
people.put("Rudra",1);
people.put("Shivaay", 2);
people.put("Suhaan", 3);
people.put("Boney", 4);
people.put("Hardik",5);

        Iterator <Integer> i = people.values().iterator();
       for (String s:people.keySet()) {
           System.out.print(i.next());
           System.out.print(",");
           System.out.println(s);

        }
    }
}
