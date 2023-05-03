package java_homework_wk6;
/*6. Write a program to enter any radius value of the circle and find out the area. (Formula
of Area A=PI*r*r).*/
public class Six {
    int PI = 10;
    int r = 20;

    public void AreaA(){
        System.out.println(PI*r*r);

    }
    public static void main(String[] args) {
       Six s = new Six();

       s.AreaA();

    }
}
