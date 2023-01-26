package Lab3;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.println("Input the names of students:");
        String []StudentName=new String[15];
        for (int i=0;i<15;i++){
            System.out.print("Enter the name of student "+(i+1)+": ");
            StudentName[i]=name.nextLine();
        }
        //name.close();
        System.out.println("The names of all students are:");
        for (int i=0;i<15;i++){
            System.out.println((i+1)+". "+StudentName[i]);
        }
    }
}

