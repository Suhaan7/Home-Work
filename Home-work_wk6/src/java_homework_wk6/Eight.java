package java_homework_wk6;

/* Write a program to insert any temperature value in degree Fahrenheit and convert to
        degree Celsius ((F − 32) × 5/9 = 0°C).*/
public class Eight {


        int f = 150;
        int a = 32;
        int b = 5;
        int c = 9;

        public void Temperature (){
            System.out.println((f-a)*b/c);

        }

        public static void main(String[] args) {
            Eight e = new Eight ();

            e.Temperature();

        }

    }
