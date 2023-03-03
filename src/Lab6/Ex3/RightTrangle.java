package Lab6.Ex3;

public class RightTrangle extends MyShape {
    private double width;
    private double height;

    public RightTrangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public double getPerimeter() {
        return width + height + Math.sqrt(width * width + height * height);
    }
    public String toString() {
        return "\n#Rightriangle"+
                "\nArea\t\t: " + getArea() +
                "\nPerimeter\t: " + getPerimeter();
    }
}
