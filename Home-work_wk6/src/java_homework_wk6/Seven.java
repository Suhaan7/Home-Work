package java_homework_wk6;

/*Write a program to insert any temperature value in degree Fahrenheit and convert
        to degree Celsius ((F − 32) × 5/9 = 0°C).*/



public class Seven {

        int f = 104;
        int a = 32;
        int b = 5;
        int c = 9;

        public void Temperature (){
            System.out.println((f-a)*b/c);

        }

    public static void main(String[] args) {
        Seven s = new Seven();

        s.Temperature();

    }

}
