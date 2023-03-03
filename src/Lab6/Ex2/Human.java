package Lab6.Ex2;
public abstract class Human {
    private String name, nationality;
    private int age;
    //constructor
    public Human(){}
    public Human(String name, String nationality, int age){
        this.name=name;
        this.nationality=nationality;
        this.age=age;
    }
    //method
    public String getName() {
        return name;
    }
    public void setName(String name) {
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
    public void setSkill(String skill){}
    public void setSalary(int salary){}
    //abstract method
    public abstract String getResponsible();
    public abstract String toString();
    public abstract int getN();
    public abstract void setSchool(String school);


}
