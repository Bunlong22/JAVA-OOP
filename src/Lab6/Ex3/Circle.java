package Lab6.Ex3;

public class Circle extends MyShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "\n#Circle" +
                "\nRadius\t\t: " + radius +
                "\nArea\t\t: " + getArea() +
                "\nPerimeter\t: " + getPerimeter();
    }
}
