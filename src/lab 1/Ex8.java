import java.util.Scanner;

public class Ex8 {
//    White a java program to get input from the user and then print it back to the screen.
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);     // get input
        System.out.println("Enter input as character: ");
        String input= sc.nextLine();             // take input and store it in var
        System.out.println("You have enter:  "+input);
    }
}
