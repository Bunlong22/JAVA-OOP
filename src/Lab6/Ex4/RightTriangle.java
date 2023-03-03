package Lab6.Ex4;
public class RightTriangle extends MyShape {
    private double width, height;
    public static int num=0;
    private int n;
    public RightTriangle(){num++; n=num;}
    public RightTriangle(double width, double height){
        this.width=width;
        this.height=height;
        num++; n=num;
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
        return width*height/2;
    }
    @Override
    public double getParameter() {
        return Math.sqrt(Math.pow(height, 2)+ Math.pow(width, 2)) + height+ width;
    }
    public String toString(){
        return "RightTriangle#"+n+
                "\nWidth\t\t:"+getWidth()+
                "\nHeight\t\t:"+getHeight()+
                "\nArea of RightTriangle\t\t:"+getArea()+
                "\nParameter of RightTriangle\t:"+getParameter();
    }
    public int getN(){
        return n;
    }
}
