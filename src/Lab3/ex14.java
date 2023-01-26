package Lab3;

public class ex14 {
    public static void helloForLoop(){
        for (int i=0;i<10;i++){
            System.out.println("helloForLoop");
        }
    }
    public static void helloWhileLoop(){
        for (int i=0;i<10;i++){
            System.out.println("helloWhileLoop");
        }
    }
    public static void helloDoWhileLoop(){
        for (int i=0;i<10;i++){
            System.out.println("helloDoWhileLoop");
        }
    }
    public static void main(String[] args) {
        helloForLoop();
        helloWhileLoop();
        helloDoWhileLoop();
    }
}
