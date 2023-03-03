package Lab5.Ex3;
//3. Write Java code to:
//a. Create Shape class which contain method double getArea(), and method double
//getPerimeter() that both method return 0.0.
//b. Create Circle class inherited Shape class which contain data member radius and
//constructors and methods(setting, getter, and other needed methods) , then
//override method getArea() and getPerimeter().
//c. Create Rectangle class inherited Shape class which contain data members Width
//and height and needed constructor and methods, and override method
//getArea() and getPerimeter().
//d. Create RightTriangle class inherited Shape class which contain data members
//width and height and needed constructor and methods, and override method
//getArea() and getPerimeter().
//e. Create Main class which contain method main then create a few objects from
//classes that creates above then print all objects(information of object) and call
//methods getArea and getPerimeter.
public class Shape {
    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }

    public void getInfo() {

        System.out.println();
        System.out.println("Area\t\t: " + getArea());
        System.out.println("Perimeter\t: " + getPerimeter());

        System.out.println();
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
//    constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
//    method
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class RightTriangle extends Shape {
    private double width;
    private double height;
    public RightTriangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public double getArea() {
        return 0.5 * width * height;
    }
    @Override
    public double getPerimeter() {
        return width + height + Math.sqrt(width * width + height * height);
    }
}

 class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("  Circle: Radius = " + c.getRadius());
        System.out.println("  Area = " + c.getArea());
        System.out.println("  Perimeter = " + c.getPerimeter());

        Rectangle r = new Rectangle(4.0, 6.0);
        System.out.println("  Rectangle: Width = " + r.getWidth());
        System.out.println(" Height = " + r.getHeight());
        System.out.println(" Area = " + r.getArea());
        System.out.println(" Perimeter = " + r.getPerimeter());

        RightTriangle t = new RightTriangle(3.0, 4.0);
        System.out.println("  Rectangle: Width = " + t.getWidth());
        System.out.println(" Height = " + t.getHeight());
        System.out.println(" Area = " + t.getArea());
        System.out.println(" Perimeter = " + t.getPerimeter());
    }
}

