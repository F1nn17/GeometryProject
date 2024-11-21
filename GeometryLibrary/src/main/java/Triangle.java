public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double halfPerimeter = perimeter() / 2;
        double result = halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c);
        return Math.sqrt(result);
    }

    public double perimeter() {
        return a + b + c;
    }
}
