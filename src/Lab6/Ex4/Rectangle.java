package Lab6.Ex4;

public class Rectangle extends MyShape {
    //data member
    private double width, height;
    public static int num=0;
    private int n;
    //constructor
    public Rectangle(){num++; n=num;}
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
        num++; n=num;
    }
    //method
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
        return width*height ;
    }
    @Override
    public double getParameter() {
    return 2*(width*height);
    }
    public String toString(){
        return "Rectangle#"+n+
                "\nWidth:\t\t"+getWidth()+
                "\nHeight:\t\t"+getHeight()+
                "\nArea of Rectangle\t\t:"+getArea()+
                "\nParameter of Rectangle\t:"+getParameter();
    }
    public int getN(){
        return n;
    }
}
