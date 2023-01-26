package Lab2;

import java.util.Scanner;

public class ex1 {
    public static void main (String[] args){
//        Write a Java Program to get input from the user as String, then print the String and the
//number of characters of that string to the console.
        Scanner sc= new Scanner(System.in);     // get input
        System.out.println("Enter Your Name: ");
        String name= sc.nextLine();
        int stringLength = name.length();

        System.out.println("You have enter:  "+name);
        System.out.println("The amount of characters:  "+stringLength);
    }
}
