package Lab2;

import java.util.Scanner;

public class ex5 {
    public static void main (String[] args){
//        Write a java program to read input from the user about age. When the age is less than
//0 print the message “The age cannot be less than 0”. Otherwise, print “your age is
//the_input_age years old”. For example: if you input the age 20 then it will print “your
//age is 20 years old
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your age: ");
        int age=scanner.nextInt();
        if (age>0){
            System.out.println("You are "+age+" years old");
        }
        else {
            System.out.println("Your age Can't be LESS THAN 0 !");
        }
    }
}
