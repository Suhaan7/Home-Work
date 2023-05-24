//8. Write the program that tell you which line pass through particular stations. Just use Zone 1 stations name. (Challenge)


import java.util.HashMap;
import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {

        HashMap <String, String> Zone1 = new HashMap<>();

        Zone1.put("Eustonsquare","CircleLine/MetropolitanLine/Hammersmith");
        Zone1.put("WaterlooStation","JubileeLine/NorthernLine/BakerlooLine");
        Zone1.put("LeicsterSquare","PicadillyLine,NorthernLine");
        Zone1.put("VictoriaStation","CircleLine,DistrictLine,VictoriaLine");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Staiton name: ");
        String Station = sc.next();

        for (String st:Zone1.keySet()) {
            if (Station.equalsIgnoreCase(st)){
                System.out.println(Zone1.get(st));
        }
    }
}
}
