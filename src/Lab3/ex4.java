package Lab3;

public class ex4 {
    public static void patternA(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.print("\n");
        }
    }
    public static void patternB(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <(n-i); j++) {
                System.out.print((j+1)+" ");
            }
            System.out.print("\n");
        }
    }
    public static void patternC(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<(n-i);j++){
                System.out.print(" "+" ");
            }
            for (int k=i;k>=0;k--){
                System.out.print((k+1)+" ");
            }
            System.out.print("\n");
        }

    }
    public static void patternD(int n){
        for (int i=0;i<n;i++) {
            for (int sp = 0; sp < i; sp++) {
                System.out.print(" " + " ");
            }
            for (int j = 0; j < (n - i); j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("PatternA");
        patternA(6);
        System.out.println("PatternB");
        patternB(6);
        System.out.println("PatternC");
        patternC(6);
        System.out.println("PatternD");
        patternD(6);
    }
}
