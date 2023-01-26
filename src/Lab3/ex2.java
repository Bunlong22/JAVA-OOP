package Lab3;

public class ex2 {
    public static void num(){
        for (int i=1;i<=100;i+=5) {
            for (int j = i; j <= (i+4); j++)
                System.out.print(j + "\t\t");
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {

        num();
    }
}

