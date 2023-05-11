/*Write if else condition and print your group name in console else others group name.*/

public class Four {

    int i = 50, j= 30; //Declared instance variables

    public static void main(String[] args) {
        Four f = new Four(); //Created object to call instance variable to main method
        if(f.i>f.j){ //Ref. variable and actual variable in global area used here
            System.out.println("My group name is JAVA");
        }
        else {
            System.out.println("Selenium or Postman");
        }
    }


















}
