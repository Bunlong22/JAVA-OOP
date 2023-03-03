package Lab6.Ex1;

public class Main {
    public static void main(String[] args) {
        Human student = new Student("Jonh", 20, "camboidan", "CADT", "E-commerce");
Human teacher = new Teacher("Pheap",26, "Cambodian", 300, "CADT" );
System.out.println(student.toString());
System.out.println(student.getResponsible());
System.out.println(teacher.toString());
System.out.println(teacher.getResponsible());
    }
}
