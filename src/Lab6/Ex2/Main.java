package Lab6.Ex2;
import java.util.Scanner;
public class Main {
    static Human [] humans = new Human[20];
    static Scanner input = new Scanner(System.in);
    static int currentIndex=0;
    public static void addStudent(){
        if(currentIndex<20){
            humans [currentIndex]= new Student();
            System.out.println("Student#"+ humans[currentIndex].getN());
            System.out.print("Name\t\t:");
            humans[currentIndex].setName(input.nextLine());
            System.out.print("Nationality\t:");
            humans[currentIndex].setNationality(input.nextLine());
            System.out.print("Age\t\t\t:");
            humans[currentIndex].setAge(input.nextInt()); input.nextLine();
            System.out.print("School\t\t:");
            humans[currentIndex].setSchool(input.nextLine());
            System.out.print("Skill\t\t:");
            humans[currentIndex].setSkill(input.nextLine());
            System.out.println("-----------------------------");
            currentIndex++;
        }
        else System.out.println("can not add new student anymore!");
    }
    public static void addTeacher(){
        if(currentIndex<20){
            humans [currentIndex]= new Teacher();
            System.out.println("Teacher#"+ humans[currentIndex].getN());
            System.out.print("Name\t\t:");
            humans[currentIndex].setName(input.nextLine());
            System.out.print("Nationality\t:");
            humans[currentIndex].setNationality(input.nextLine());
            System.out.print("Age\t\t\t:");
            humans[currentIndex].setAge(input.nextInt()); input.nextLine();
            System.out.print("Salary\t\t:");
            humans[currentIndex].setSalary(input.nextInt()); input.nextLine();
            System.out.print("School Name\t\t:");
            humans[currentIndex].setSchool(input.nextLine());
            System.out.println("-----------------------------");
            currentIndex++;
        }
        else System.out.println("can not add new teacher anymore!");
    }
    public static int searchByName(String name){
        for (int i=0; i<humans.length; i++){
            if (humans[i]!=null){
                if (humans[i].getName().equals(name)) return i;
            }
        }
        return -1;
    }
    public static void editByName(String name){
        int index = searchByName(name);
        if(index==-1) System.out.println("Not Found!");
        else {
            System.out.println("Found!");
            System.out.println("Current Information");
            System.out.println(humans[index].toString());
            System.out.println("change information");
            if(humans[index] instanceof Student){
                humans [index]= new Student();
                System.out.println("Student#"+ humans[index].getN());
                System.out.print("Name\t\t:");
                humans[index].setName(input.nextLine());
                System.out.print("Nationality\t:");
                humans[index].setNationality(input.nextLine());
                System.out.print("Age\t\t\t:");
                humans[index].setAge(input.nextInt()); input.nextLine();
                System.out.print("School\t\t:");
                humans[index].setSchool(input.nextLine());
                System.out.print("Skill\t\t:");
                humans[index].setSkill(input.nextLine());
                System.out.println("-----------------------------");
            }
            else {
                humans [currentIndex]= new Teacher();
                System.out.println("Teacher#"+ humans[index].getN());
                System.out.print("Name\t\t:");
                humans[index].setName(input.nextLine());
                System.out.print("Nationality\t:");
                humans[index].setNationality(input.nextLine());
                System.out.print("Age\t\t\t:");
                humans[index].setAge(input.nextInt()); input.nextLine();
                System.out.print("Salary\t\t:");
                humans[index].setSalary(input.nextInt()); input.nextLine();
                System.out.print("School Name\t\t:");
                humans[index].setSchool(input.nextLine());
                System.out.println("-----------------------------");
            }
        }
    }
    public static void printAll(){
        if(currentIndex==0) System.out.println("Nothing! info!");
        else {
            for(Human human : humans){
                if(human instanceof Student);{
                System.out.println(human.toString());
            }
        }
            for (Human human : humans){
            if(human instanceof Teacher){
                System.out.println(human.toString());
            }
            }
        }
    }
    public static void main(String[] args) {
        while (true){
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Search By Name");
            System.out.println("4. Edit By Name");
            System.out.println("5. Print All");
            System.out.println("6. Exit ");
            System.out.print("Choose option to use!");
            int option = input.nextInt(); input.nextLine();
            if(option==6){
                break;
            }
            else if(option > 6 || option <1){
                System.out.println("Your input is incorrect");
            }
            else {
                switch (option){
                    case 1 -> addStudent();
                    case 2 -> addTeacher();
                    case 3 -> {
                        System.out.println("Enter name of student or teacher to search!");
                        int index = searchByName(input.nextLine());
                        if (index==-1) System.out.println("\nNot Found!");
                        else {
                            System.out.println("Found!");
                            System.out.println(humans[index].toString());
                        }
                    }
                    case 4 -> {
                        System.out.println("Enter name of student or teacher to edit");
                        editByName(input.nextLine());
                    }
                    case 5-> printAll();
                }
            }
            System.out.println("---------------------------");
        }
    }
}
