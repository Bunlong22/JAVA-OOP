package Lab2;

public class ex12 {
    public static boolean isEven(int j){
        if(j%2==0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        int num=10;
        if(isEven(num)==true){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
