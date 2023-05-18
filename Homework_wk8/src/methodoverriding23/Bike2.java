package methodoverriding23;

public class Bike2 extends Vehicle{

    public void run(){ //defining the same method as in parent class
        System.out.println("Bike is running safely");
    }


    public static void main(String[] args) {
        Bike2 b = new Bike2();//creating object
        b.run();
    }
}
