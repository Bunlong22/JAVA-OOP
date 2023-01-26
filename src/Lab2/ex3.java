package Lab2;

import java.util.Scanner;

public class ex3 {
    public static void main (String[] args){
//         Write a Java program to get a number from the user and print whether it is positive or
//negative.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num =scanner.nextInt();
        if (num>=0){
            System.out.println("Positive! ");
        }
        else {
            System.out.println("Negative! ");
        }
    }
}
