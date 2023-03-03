package Lab5.Ex2;
//Write a Java Program to create classes like the following:
//a. The Class Human with private data members (name, age) and setter, getter
//methods, and constructors
//b. The Class Student inherits Human class, it has data members (studentId,
//schoolName, skill) and getter, setter methods, and constructors.
//c. Main class with the main method then create an Object of Human and an Object
//of Student and print all objects (all information of object).
public class Humans {
    private String name;
    private int age;
public Humans(){

}
    public Humans(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
class Students extends Humans{
    private String studentId, schoolname,skill ;

    public Students(){

    }
    public Students(String schoolname, String studentId, String skill) {
        this.schoolname = schoolname;
        this.studentId = studentId;
        this.skill = skill;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
class Main {
    public static void main(String[] args) {
        Humans h1= new Humans("Jonh", 30);
        System.out.println("Name: "+ h1.getName());
        System.out.println("Age: "+ h1.getAge());
        Students s1= new Students("CADT", "IDT0001", "Programming");
        System.out.println("Student ID: " + s1.getStudentId());
        System.out.println("School Name: " + s1.getSchoolname());
        System.out.println("Student Skill: " + s1.getSkill());

    }
}