package seventeen_carpetcostcalculator;

public class Main {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);

        double Floor = 0; 
        double Carpet = 0;
        Calculator cal = new Calculator(floor, carpet);
        System.out.println ("total= " + cal.getTotalCost());
        Carpet c = new Carpet(1.5);
        Floor f = new Floor(4.5, 5.4);

        Calculator cal2 = new Calculator(floor, carpet);
        System.out.println("total= " + cal2.getTotalCost());

    }

}
