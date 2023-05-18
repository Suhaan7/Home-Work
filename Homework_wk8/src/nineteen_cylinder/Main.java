package nineteen_cylinder;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(3.75);
        System.out.println("circle.radius = " + c.getRadius());
        System.out.println("circle.area = " + c.getArea());

        Cylinder cy = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = "+ cy.getRadius());
        System.out.println("cylinder.height = "+ cy.getHeight());
        System.out.println("cylinder.area = " + cy.getArea());
        System.out.println("cylinder.volume = " + cy.getVolume());
    }


}
