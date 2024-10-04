public class TestCircle {
    public static void main(String[] args) {
        
        Circle a = new Circle();
        a.setRadius(3);

        System.out.println("Circle a:");
        System.out.println("Radius of the first circle: " + Circle.getRadius());
        System.out.println("Diameter of the circle: " + Circle.getDiameter());
        System.out.println("Area of the circle: " + Circle.getArea());

        Circle b = new Circle();
        b.setRadius(20);

        System.out.println("Circle b:");
        System.out.println("Radius of the second circle: " + Circle.getRadius());
        System.out.println("Diameter of the second circle: " + Circle.getDiameter());
        System.out.println("Area of the seond circle: " + Circle.getArea());



    }   
}