package Lab6.Ex4;

import java.util.Scanner;

public class Main {
    static MyShape [] myShapes = new MyShape[20];
    static Scanner in = new Scanner(System.in);
    static int currentIndex=0;
    public static void addRectangle(){
    if(currentIndex<20){
        myShapes[currentIndex]=new Rectangle();
        System.out.println("Rectangle#"+myShapes[currentIndex].getN());
        System.out.print("Width\t\t:");
        myShapes[currentIndex].setWidth(in.nextDouble());
        System.out.print("Height\t:");
        myShapes[currentIndex].setHeight(in.nextDouble());
        currentIndex++;
    }
    else System.out.println("Can not add Rectangle anymore!");
    }
    public static void addRightTriangle(){
        if(currentIndex<20){
            myShapes[currentIndex]=new RightTriangle();
            System.out.println("Right Triangle#"+myShapes[currentIndex].getN());
            System.out.print("Width\t\t:");
            myShapes[currentIndex].setWidth(in.nextDouble());
            System.out.print("Height\t:");
            myShapes[currentIndex].setHeight(in.nextDouble());
            currentIndex++;
        }
        else System.out.println("Can not add Rectangle anymore!");
    }
    public static void addCircle(){
        if(currentIndex<20){
            myShapes[currentIndex]=new Circle();
            System.out.println("Circle#"+myShapes[currentIndex].getN());
            System.out.print("Radius\t\t:");
            myShapes[currentIndex].setRadius(in.nextDouble());
            currentIndex++;
        }
        else System.out.println("Can not add Rectangle anymore!");
    }
    public static int searchObjectByArea(double area){
        for(int i=0; i< myShapes.length;i++){
            if(myShapes[i]!=null && myShapes[i].getArea() == area){
                return i;
            }
        }
        return -1;
    }
    public static void printAll(){
       if(currentIndex == 0) System.out.println("Nothing here!");
       else {
           for(MyShape myShape : myShapes){
               if(myShape instanceof Rectangle){
                   System.out.println(myShape.toString());
               }
           }
           for(MyShape myShape : myShapes){
               if(myShape instanceof RightTriangle){
                   System.out.println(myShape.toString());
               }
           }
           for(MyShape myShape : myShapes){
               if(myShape instanceof Circle){
                   System.out.println(myShape.toString());
               }
           }
       }
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("1. Add Rectangle:");
            System.out.println("2. Add RightTriangle:");
            System.out.println("3. Add Circle:");
            System.out.println("4. Search Object By Area:");
            System.out.println("5. Print All:");
            System.out.println("6. Close Program:");
            System.out.print("7. Choose any Option to use:");
            int option = in.nextInt();
            if(option==6){
                System.out.println("-------------------------");
                break;}
            else if(option < 1 || option >5) System.out.println("Your input is incorrect");
            else {
                switch (option){
                    case 1 -> addRectangle();
                    case 2 -> addRightTriangle();
                    case 3 -> addCircle();
                    case 4 -> {
                        System.out.print("Enter value of area to search object!\t");
                        int index = searchObjectByArea(in.nextDouble());
                        if (index==-1) System.out.println("Not Found!");
                        else {
                            if (myShapes[index]instanceof Rectangle){
                                System.out.println("The object that has in " +
                                        "this area was created by Rectangle class");
                            } else if (myShapes[index] instanceof RightTriangle) {
                                System.out.println("The object that has in " +
                                        "this area was created by RightTriangle class");
                            }
                            else System.out.println("The object that has in" +
                                    " this area was created by Circle class");
                        }
                    }
                    case 5 -> printAll();
                }
            }
            System.out.println("-------------------------");
        }
    }
}
