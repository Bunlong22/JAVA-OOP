package Lab6.Ex3;

public class Main {
    public  static void main (String[] args){
        MyShape r1 = new Rectangle(45, 12);
        MyShape r2 = new RightTrangle(12, 29);
        MyShape c1= new Circle(3.3);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(c1.toString());
    }



}
