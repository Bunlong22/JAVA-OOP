package Lab2;

import java.util.Scanner;

public class ex7 {
    public static void main (String[] args){
//        Write a Java program to get input about the name, gender (F or f for female and m or
//M for Male), status (single or married) then prints to screen based on gender and
//status, In case:
//- the gender is female and status is single then print “Hello Miss. the_input_name”
//- the gender is female and status is married then print “Hello Ms. the_input_name”
//- otherwise print “Hello Mr. the_input_name”.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Your gender M or F: ");
        String gender = scanner.nextLine();
        System.out.println("Enter Your Status single or married: ");
        String status = scanner.nextLine();

        if (gender.equals("F")&& status.equals("single")){
            System.out.println("Hello Miss. "+name);

        }
        else if (gender.equals("F")&& status.equals("married")){
            System.out.println("Hello Ms. "+name);

        }
        else {
            System.out.println("Hello Mr. "+name);
        }

    }
}
