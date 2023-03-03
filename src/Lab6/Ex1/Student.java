package Lab6.Ex1;

public  class Student extends Human {
    // Fields
    private String schoolName, skill;
    private static int n = 0;


    // Constructors
    public Student() {
        n++;
    }

    public Student(String name, int age, String nationality, String schoolName, String skill) {
        super(name, age, nationality);
        this.schoolName = schoolName;
        this.skill = skill;
        n++;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String getResponsible() {
        return "Student Study";

    }

    @Override
    public String toString() {

            return "Student#" + n +
                    "\nName\t: " + getName() +
                    "\nAge\t\t: " + getAge() +
                    "\nNationality\t:" + getNationality() +

                    "\nSchool Name\t: " + schoolName +
                    "\nSkill\t:" + skill + "\n";
        }


    }

