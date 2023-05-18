package methodoverriding24;

public class TestClass24 {

    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        Axis a = new Axis();
        System.out.println("SBI Rate of Inerest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("Axis Rate of Interest: " + a.getRateOfInterest());

    }



}
