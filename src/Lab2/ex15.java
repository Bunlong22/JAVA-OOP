package Lab2;

public class ex15 {
    public static double sum(double a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static double sum(int a, double b){
        return a+b;
    }
    public static double sum(double a, double b, double c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println("sum of double with int "+sum(25.50,25));
        System.out.println("sum of double with double "+sum(55.50,44.50));
        System.out.println("sum of int with double "+sum(50,45.50));
        System.out.println("sum of double with double and double "+sum(30.30,30.30,30.30));
    }
}
