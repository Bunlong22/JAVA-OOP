package Lab07.Ex02;
public class Teacher extends Human {
    private String salary, schoolname;
    private int n;
    private static int num =0;
    public Teacher (){num++; n=num;}
    public Teacher(String name, String nationality, int age, String salary, String schoolName){
        super(name, nationality, age );
        this.salary=salary;
        this.schoolname=schoolName;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getSchoolname() {
        return schoolname;
    }
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
    @Override
    public String getResponsible(){
        return "Teach";
    }
    @Override
    public String toString(){
        return "Teacher Info:"+n
                +"\nName\t\t:"+getName()+
                "\nNationality\t:"+getNationality()+"\nAge\t\t\t:"+getAge()+
                "\nSalary\t\t:"+getSalary()+
                "\nSchool Name\t:"+getSchoolname();
    }
    @Override
    public int getN(){
        return n;
    }
    @Override
    public void setSchool(String school) {
        this.schoolname=school;
    }
}
