package Lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row:");
        int a = sc.nextInt();
        System.out.print("Enter the number of column:");
        int c = sc.nextInt();
        int[][] arrayInteger = new int[a][c];
        Random randomNum = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                arrayInteger[i][j] = randomNum.nextInt(10);
            }
            Arrays.toString(arrayInteger);
        }
        System.out.println("The 2 dimensions array after random is:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arrayInteger[i][j]+"\t\t");
            }
            System.out.print("\n");
        }
    }
}
