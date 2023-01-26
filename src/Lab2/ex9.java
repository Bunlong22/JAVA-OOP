package Lab2;

public class ex9 {
    //        write a Java program to create and use the following functions:
//a. int add (int a, int b)
//b. int minus (int a, int b)
//c. int div (int a, int b)
//d. int multi (int a, int b)
//e. int mod (int a, int b)
    public static  int add (int a, int b){
        return a+b;
    }
    public static int minus (int a, int b){
        return a-b;
    }
    public static int div (int a, int b){
        return a/b;
    }
    public static int multi (int a, int b){
        return a*b;
    }
    public static int mod (int a, int b){
        return a%b;
    }
    public static void main(String[] args){
        System.out.println(ex9.add(11,22));
        System.out.println(ex9.minus(22,11));
        System.out.println(ex9.div(99,33));
        System.out.println(ex9.multi(20,5));
        System.out.println(ex9.mod(10,3));
    }
}