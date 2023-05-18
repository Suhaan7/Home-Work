package eighteen_sumcalculator;
/*18. Sum Calculator
Write a class with the name SimpleCalculator. The class needstwo fields(instance variables) with
names firstNumber and secondNumber both of type double.
Write the following methods(instance methods):
● Method named getFirstNumber without any parameters, it needsto return the value of the
firstNumber field.
● Method named getSecondNumber without any parameters, it needs to return the value of
the secondNumber field.
● Method named setFirstNumber with one parameter oftype double, it needsto set the value
of the firstNumber field.
● *Method named setSecondNumber with one parameter oftype double, it needsto set the
value of the secondNumber field.
● Method named getAdditionResult without any parameters, it needsto return the result of
adding the field values of firstNumber and secondNumber.
● Method named getSubtractionResult without any parameters, it needsto return the result of
subtracting the field values of the secondNumber from the firstNumber.
● Method named getMultiplicationResult without any parameters, it needsto return the result
of multiplying the field values of firstNumber and secondNumber.
● Method named getDivisionResult without any parameters, it needsto return the result of
dividing the field values of firstNumber by the secondNumber. In case the value of
secondNumber is 0 then return 0.
TEST EXAMPLE
TEST CODE:Write the bellow code into main method
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());
OUTPUT
add= 9.0
subtract= 1.0
multiply= 0.0
divide= 0.0
TIPS:
● add= 9.0 is printed because 5.0 + 4 is 9.0
● subtract= 1.0 is printed because 5.0 - 4 is 1.0
● multiply= 0.0 is printed because 5.25 * 0 is 0.0
● divide= 0.0 is printed because secondNumber is set to 0
NOTE: All methodsshould be defined as public NOT public static.
NOTE: In total, you have to write 8 methods.*/

public class SimpleCalculator {
    double firstNumber, secondNumber;

    public SimpleCalculator (double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

public double getFirstNumber(){ return firstNumber;}

    public double getSecondNumber (){return secondNumber;}

    public double setFirstNumber(double firstNumber){return firstNumber;}

    public double setSecondNumber (double secondNumber){return secondNumber;}

    public double getAdditionResult(){return (firstNumber+secondNumber);}
    public double getSubtractionResult(){return (secondNumber-firstNumber);}
    public double getMultiplicationResult(){return (firstNumber*secondNumber);}
    public double getDivisionResult(){return (firstNumber/secondNumber);}

}
