public class GeometryApp {
    public static void main(String[] args) {
        System.out.println();
        Circle circle = new Circle(5);
        System.out.println("Circle: Area = " + circle.area() + ", Perimeter = " + circle.perimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle: Area = " + rectangle.area() + ", Perimeter = " + rectangle.perimeter());

        Triangle triangle = new Triangle(4, 5 ,6);
        System.out.printf("Triangle: Area = %.2f, Perimeter = %.2f\n", triangle.area(), triangle.perimeter());

        Sphere sphere = new Sphere(1024);
        System.out.printf("Sphere: Area = %.2f, Volume = %.2f\n", sphere.getSurfaceArea(), sphere.getVolume());
    }
}
