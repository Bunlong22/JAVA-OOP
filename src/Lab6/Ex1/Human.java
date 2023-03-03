package Lab6.Ex1;

public abstract class Human {
    private String name, nationality;
    private int age;

    // Constructors
    public Human() {
    }

    public Human(String name, int age, String nationality) {


        this.name = name;
        this.age = age;
        this.nationality = nationality;

    }

    // Concrete Methods
    public String getName() {
        return name;

    }

    public void setName(String nane) {
        this.name = name;
    }


    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;

    }
    public void setAge(int age) {
        this.age = age;
    }

    // Abstract Methods.
    public abstract String getResponsible();
    public abstract String toString();
}
