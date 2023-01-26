package Lab2;

import java.util.Scanner;

public class ex11 {
    public static boolean isNegativeNumber(int j){
        Scanner input = new Scanner(System.in);
        System.out.println("input number of j: ");
        j=input.nextInt();
        if(j<0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        if(isNegativeNumber(-0)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
