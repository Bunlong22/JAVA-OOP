import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args){
//        Write a program that converts kilograms into pounds. The program prompts the user
//to enter a number in kilograms, converts it to pounds, and displays the result. Hint:
//One pound is 0.454 kilograms.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Kilos: ");
        int Kilo=sc.nextInt();
        double pounds= Kilo/0.454;
//        when use with float need to define f in the end, cuz in default it's double;
//        interger have maximum num, for many numbers use long and declare l in the end of value.
        System.out.println("Pounds: "+pounds);
    }
}
