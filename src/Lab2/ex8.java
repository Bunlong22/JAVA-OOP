package Lab2;

import java.util.Scanner;

public class ex8 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        switch (letter) {
            case 'a' -> System.out.println("A for apple");
            case 'b' -> System.out.println("b for boy");
            case 'c' -> System.out.println("c for cat");
            case 'd' -> System.out.println("d for dog");
            case 'e' -> System.out.println("e for elephant");
            case 'f' -> System.out.println("f for fat");
            case 'g' -> System.out.println("g for girl");
            case 'h' -> System.out.println("h for house");
            case 'i' -> System.out.println("i for ice cream");
            case 'j' -> System.out.println("j for jelly");
            case 'k' -> System.out.println("k for knee");
        }


    }
}
