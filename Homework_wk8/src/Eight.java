/*
8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
*/

public class Eight {
    public static void main(String[] args) {

        int n = 5;
        int row;
        int col;

        for (row = 1; row <= n; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("@ ");
            }
            System.out.println();
        }

    }
}
