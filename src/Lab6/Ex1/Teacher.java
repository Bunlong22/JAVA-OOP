package Lab6.Ex1;


    public class Teacher extends Human {

        private int salary;
        private String schoolName;
        private static int n = 0;

        // Constructors
        public Teacher() {
            n++;
        }

        public Teacher(String name, int age, String nationality, int salary, String schoolName) {
            super(name, age, nationality);
            this.salary = salary;
            this.schoolName = schoolName;


        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        @Override
        public String getResponsible() {
            return "Teach";
        }

        @Override
        public String toString() {
            return "Teacher" + n +

                    "\nName\t: " + getName() +
                    "\nAge\t\t: " + getAge() +
                    "\nNationality\t: " + getNationality() +
                    "\nSalary\t: " + salary +
                    "\nSchool Name\t: " + schoolName + "\n";
        }
    }
