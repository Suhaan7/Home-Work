//9. Write program and add all group names in to array and iterates through for each loop.

public class Ten {

    public static void main(String[] args) {

        String groupnames[] = new String[4];

        groupnames[0] = "Nimit";
        groupnames[1] = "Anish";
        groupnames[2] = "Shweta";
        groupnames[3] = "Kruti";

        for (String s : groupnames) {
            if (s.equalsIgnoreCase("SHWETA")) {
                System.out.println(s);
            }
        }

    }}
