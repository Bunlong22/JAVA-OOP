package Lab3;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []array=new int[5];
        for (int i=0;i<5;i++){
            System.out.print("Input the element of array:");
            array[i]=sc.nextInt();
        }
        System.out.println("The input array is");
        for (int arrayElement:array){
            System.out.print(arrayElement+" ");
        }
    }
}
