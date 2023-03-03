package Lab6.Ex2;

public class Student extends Human {
    private String schoolname, skill;
    private int n;
    private static int num =0;
    public Student(){num++; n=num;}
    public Student(String name, String nationality, int age,String schoolname, String skill){
        super(name,nationality, age);
        this.schoolname=schoolname;
        this.skill=skill;
        num++; n=num;
    }
    public String getSchool() {
        return schoolname;
    }
    public void setSchool(String schoolname) {
        this.schoolname = schoolname;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public int getN(){return n;}
    @Override
    public String getResponsible() {
        return "Study";
    }
    @Override
    public String toString() {
        return "Student Info:"+ n +
                "\nName\t\t:"+ getName()
                +"\nAge\t\t\t:"+ getAge()+
                "\nNationality\t:"+ getNationality()
                +"\nSchool\t\t:"+ getSchool()+
                "\nSkill\t\t:"+ getSkill();
    }
}
