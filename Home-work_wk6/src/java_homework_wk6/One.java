package java_homework_wk6;

/*1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.*/

public class One {

    int i = 10;
    int j = 20;

    public void m1(){
        System.out.println(i);
        System.out.println(j);

    }

    public static void main(String[] args) {

        One o=new One();
        o.m1();

    }

}
