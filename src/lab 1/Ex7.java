public class Ex7 {
    public static void main(String[] args){
//        Write a Java program to swap two variables x and y
        int x=10;
        int y= 20;
        System.out.println("Before Swapping : ");
        System.out.println(x);
        System.out.println(y);
       int temp;
       temp=x;
       x=y;
       y=temp;
        System.out.println("After Swapping : ");
        System.out.println(x);
        System.out.println(y);
    }
}
