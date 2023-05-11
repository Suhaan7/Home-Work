package java_programmes;

//Wall Area//
public class Wall_Eighteen {
    double width, height;
public Wall_Eighteen(){
    System.out.println("no-argument constructor");//Declared constructor with no-arguments
}
public Wall_Eighteen(double width, double height){//Declared constructor with two-arguments (width & height)
    this.height=4;
    this.width=5;
}
public double getWidth() {//Return type with no parameters
    return width;
}
public double getHeight(){//Return type with no parameters
return height;
}
public void setWidth (double a){ //No Return-type with 1 parameters
    if (a<0) {width=0;}
    System.out.println(a);

}
public void setHeight (double b){//No Return-type with 1 parameters
    if (b<0) {height=0;}

}
public double getArea(){
    return height*width;
}
    public static void main(String[] args) {

     Wall_Eighteen wall = new Wall_Eighteen(5,4);

        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}
