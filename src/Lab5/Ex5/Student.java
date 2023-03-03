package Lab5.Ex5;
//    Write a Java Program to create class Student base on following information:
//a. Data member:
// firstname
// lastname
// age
// height
// address
//b. Method member and constructor:
// Student ()
// Student (firstname, lastname, age)
// Student (firstname, lastname, age,height,address)
// Setter & getter method.
// Void getInfo();
//Create main method then instance object Student then testing it.
public class Student {
    //a. Data member:

    private String firstname, lastname, height, address;

    private int age;


    public Student(){

    }
    public Student(String firstname, String lastname, int age){
        this.firstname= firstname;
        this.lastname=lastname;
        this.age=age;

    }
    public Student(String firstname, String lastname, int age, String height, String address){
        this.firstname= firstname;
        this.lastname=lastname;
        this.age=age;
        this.height= height;
        this.address= address;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAddress() {
        return address;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //    Methods
    public void getInfo(){
        System.out.println("**************Student Info *********************");
        System.out.println();
        System.out.println("Firstname: " + getFirstname());
        System.out.println("Lastname: " + getLastname());
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight());
        System.out.println("Address: " + getAddress());
    }

    public void printInfo(){
        System.out.println("Firstname: "+getFirstname());
        System.out.println("Lastname:"+getLastname());
        System.out.println("Student age:"+getAge());
        System.out.println("Student Height:"+getHeight());

        System.out.println("Address: "+getAddress());
    }

    public static void main(String[] args) {

            // Instance object using the first constructor
            Student student1 = new Student("John Wick", "Doe", 22);
            student1.setHeight("1.75 CM");
            student1.setAddress("123 Main Street");

            // Instance object using the second constructor
            Student student2 = new Student("Janney", "Doe", 24, "1.80 CM", "456 Main Street");

            // Display information of student1
            System.out.println("Student 1:");
            student1.getInfo();
            System.out.println("Student 1");
            

            System.out.println();

            // Display information of student2
            System.out.println("Student 2:");
            student2.getInfo();


        }
}

