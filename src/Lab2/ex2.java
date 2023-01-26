package Lab2;

import java.util.Scanner;

public class ex2 {
    public static void main (String[] args){
//        Write a Java Program to get 1 String from the user then compare if the string equals
//“Hello” ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = scanner.next();
        if (input.equals("Hello")) {
            System.out.println("Hello World!");
        }
        else{
            System.out.println("Not Hello World!");
        }
    }
}
