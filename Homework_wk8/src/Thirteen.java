public class Thirteen {

    public static void hasSharedDigit(int a, int b) {

        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {

        hasSharedDigit(87, 100);

    }
}



