package Lab3;

public class ex5 {
    public static void checkNumber(int n) {
        int i,count=0;
        for (i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(n+" is prime number");
        }else {
            System.out.println(n+" is not prime number");
        }
    }
    public static void main (String[]args){

        checkNumber(200);
    }
}
