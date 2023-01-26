package Lab2;

import java.util.Scanner;

public class ex4 {
    public static void main (String[] args){
//        Write a java program to get three integer numbers from the user by using the scanner
//and print the largest number to the console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a= scanner.nextInt();
        System.out.println("Enter Number 2: ");
        int b= scanner.nextInt();
        System.out.println("Enter Number 3: ");
        int c= scanner.nextInt();
//        for a
        if (a>b && a>c){
            System.out.println("1 is the biggest: "+a);
        }
        else if (a<c && c>b){
            System.out.println("3 is the biggest: "+c);
        }
        else if (a<b && b>c){
            System.out.println("2 is the biggest: "+b);
        }
        else {
            System.out.println("No number: ");
        }

    }
}
