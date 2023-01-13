import java.util.Scanner;

public class Ex10 {
//White program to get input circle’s radius from the user and then calculate and print
//the area and perimeter to screen.
public static void main (String[] args){
    Scanner sc= new Scanner(System.in);  // get input
    System.out.println("Enter Radius: ");
    double r = sc.nextDouble();
    double a = Math.PI * (r * r);
    double p = 2 * Math.PI * r;
    System.out.println(" area: " + a);
    System.out.println(" perimeter: " + p);
}
}