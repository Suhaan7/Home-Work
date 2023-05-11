//Write a java program to input any number and find out if it’s odd or even.//
public class Seven {

    int i = 7;// Instance variable in global area

    public static void main(String[] args) {
        Seven s = new Seven(); //Created object to call instance variable in main method
        if(s.i%2==0){
            System.out.println("Number is even number");
                    }
        else{
            System.out.println("Number is odd number");// This would be the result as 7 is not divided by 2 and the remainder is not 0.
        }

    }


}
