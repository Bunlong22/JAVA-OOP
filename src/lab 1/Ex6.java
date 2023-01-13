import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
//         White a java program to get Input for 2 numbers from the user then sum them and
//print screen.
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum:  "+sum);
    }
}
