//public class Lab5.Ex1 {
//    public static void main(String[] args ){
//        int x =1;
//        if (x>0 && x<10){
//            System.out.println("true");
//        }
//    }
//}
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}

class Main {
    static void display(Shape shape) {
        shape.draw();
    }


    public static int sum(int a, int b) {
        return a+b;
    }


}
