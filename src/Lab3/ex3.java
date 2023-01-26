package Lab3;

public class ex3 {
    public static void patternA(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void patternB(int n){
        for (int i=1;i<=n;i++) {
            for (int sp = 0; sp < (n-i); sp++) {
                System.out.print(" ");
            }
            for (int s = 0; s < (2 * i - 1); s++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void patternC(int n){
        for (int i=1;i<=n;i++) {
            for (int sp = 0; sp < (i-1); sp++) {
                System.out.print(" "+" ");
            }
            for (int s =(2*n); s > (2 * i - 1); s--) {
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        }
    }
    public static void patternD(int n) {
        for (int i = 1; i <= n; i++) {
            for (int sp = 0; sp < (n - i); sp++) {
                System.out.print(" "+" ");
            }
            for (int s = 0; s < (2 * i - 1); s++) {
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        }
        for (int i=1;i<=(n-1);i++) {
            for (int sp = 0; sp <= (i-1); sp++) {
                System.out.print(" "+" ");
            }
            for (int s =(2*(n-1)); s > (2 * i - 1); s--) {
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main (String[]args){
        System.out.println("PatternA");
        patternA(5);
        System.out.println("PatternB");
        patternB(5);
        System.out.println("PatternC");
        patternC(5);
        System.out.println("PatternD");
        patternD(5);
    }
}
