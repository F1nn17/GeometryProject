public class Cube {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getVolume() {
        return Math.pow(sideLength, 3); // Объем = a^3
    }

    public double getSurfaceArea() {
        return 6 * Math.pow(sideLength, 2); // Площадь поверхности = 6 * a^2
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
