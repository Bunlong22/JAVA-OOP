package Lab5.Ex5;
//5. Write a Java program to create classes as the following:
//c. Class Point which contain data member int x, int y and member method
//getter & setter and needed constructors.
//d. Class Line which has data member Point p1, Point p2 and member method getter
//& setter and needed constructors.
//e. Class Main contain main method then create 2 Line objects then print the
//coordinate
public class Point {
    private int x, y;

    public  Point (){

    }
    public  Point (int x){
        this.x=x;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y= y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
}
class main{
    public static void main(String[] args) {
        // Create two Point objects
        Point p1 = new Point(-1, -2);
        Point p2 = new Point(-3, -4);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(new Point(1, 2), new Point(3, 4));
System.out.println("This is created from 2 points: ");
        System.out.println("p1: (" + line1.getP1().getX() + ", " + line1.getP1().getY() + "),  p2 (" + line1.getP2().getX() + ", " + line1.getP2().getY() + ")");
        System.out.println("This is created from 2 points: ");
        System.out.println("p1: (" + line2.getP1().getX() + ", " + line2.getP1().getY() + ") , p2(" + line2.getP2().getX() + ", " + line2.getP2().getY() + ")");
    }
}