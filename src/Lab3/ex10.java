package Lab3;

import java.util.Arrays;
import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random randomNum=new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNum.nextInt(100);
        }
        System.out.println("Random numbers= "+ Arrays.toString(numbers));
        //findAvg(numbers);
        //findMax(numbers);
        printAll(numbers);
    }

    public static double findAvg(int[] numbers) {
        int sum = 0, i;
        for (i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double avg = (double) sum / (numbers.length);
        System.out.println("The average of array is :" + avg);
        return avg;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum value of array is: "+max);
        return max;
    }
    public static void printAll(int[] numbers){
        findAvg(numbers);
        findMax(numbers);
    }
}
