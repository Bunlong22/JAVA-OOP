package Lab6.Ex4;

public class Circle extends MyShape {
    private double radius;
    public static int num=0;
    private int n;
    public Circle(){num++;n=num;}
    public Circle( double radius){this.radius=radius; num++; n=num;}
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
    @Override
    public double getParameter() {
        return 2 * Math.PI*radius;
    }
    public String toString(){
        return"Circle#"+n+
                "\nradius\t\t:"+getRadius()+
                "\nArea of Circle\t\t\t:"+getArea()+
                "\nParameter of Circle\t:"+getParameter();
    }
    public int getN(){
        return n;
    }
}
