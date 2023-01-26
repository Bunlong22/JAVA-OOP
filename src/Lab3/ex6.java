package Lab3;

import java.util.Random;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Random rd=new Random();
        int result=rd.nextInt(100);
        Scanner sc=new Scanner(System.in);
        for (int i=1;i>0;i++){
            System.out.print("Guest a number:");
            int number=sc.nextInt();
            if (number==result){
                System.out.print("Congrats ! you are correct the number is "+result);
                break;
            }else {
                if (number<result){
                    System.out.println("The number is bigger than "+number);
                }else {
                    System.out.println("The number is smaller than "+number);
                }
            }
        }
    }
}
