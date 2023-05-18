/*6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910*/

public class Six {
    public static void main(String[] args) {

     int n = 10;
     int row;
     int col;

     for(row=1; row<=n; row++){
         for (col=1; col<=row; col++){
             System.out.print(col);
         }
         System.out.println();
     }

    }
}
