//11. Declare global variables of your name, Add all your group names in list, using for each loop iterate and print ONLY your name.

import java.util.ArrayList;

public class Eleven {

    static String name = "Shweta";

    public static void main(String[] args) {
        ArrayList<String> groupnames = new ArrayList<>();

        groupnames.add("Kruti");
        groupnames.add("Anish");
        groupnames.add("Nimit");
        groupnames.add(name);

        for (String s : groupnames) {
            if (s.equalsIgnoreCase(name)) {
                System.out.println(s);
            }
        }
    }}
