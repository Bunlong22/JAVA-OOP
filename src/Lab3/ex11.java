package Lab3;

public class ex11 {
    public static void main(String[] args) {
        int[][] arrayData = { {1,2,3}, {4,5,6},{7,8,9,10} };
        System.out.println("The 2 dimensions array is:");
        for (int i=0;i<arrayData.length;i++){
            for (int j = 0; j <arrayData[i].length; j++) {
                int []num=arrayData[i];
                System.out.print(arrayData[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
