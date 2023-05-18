package eighteen_sumcalculator;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator(5.0,4);
        sc.setFirstNumber(5.0);
        sc.setSecondNumber(4);
        System.out.println("Add = " + sc.getAdditionResult());
        System.out.println("Subtract = " + sc.getSubtractionResult());

        sc.setFirstNumber(5.25);
        sc.setSecondNumber(0);
        System.out.println("Multiply = " + sc.getMultiplicationResult());
        System.out.println("Division = " + sc.getDivisionResult());


    }
}
