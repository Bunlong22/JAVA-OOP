import java.util.Scanner;

public class Ex9 {
//    White a java program to get inputs from the user such as full name, age, and address
public static void main (String[] args){
    Scanner sc= new Scanner(System.in);     // get input
    System.out.println("Enter Your Name: ");
    String name= sc.nextLine();             // take input and store it in var
    System.out.println("Enter Your age: ");
    int age=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Your address: ");
    String ad= sc.nextLine();   // take input and store it in var

    System.out.println("You have enter:  "+name);
    System.out.println("You have enter:  "+age);
    System.out.println("You have enter:  "+ad);
}
}

