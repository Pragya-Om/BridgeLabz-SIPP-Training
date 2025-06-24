package Constructors.AccessModifiers;


public class UniversityManagement {


    static class Student {
        public int rollNumber;           
        protected String name;          
        private double CGPA;             

       
        public Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

      
        public double getCGPA() {
            return CGPA;
        }

     
        public void setCGPA(double CGPA) {
            if (CGPA >= 0.0 && CGPA <= 10.0) {
                this.CGPA = CGPA;
            } else {
                System.out.println("Invalid CGPA. Must be between 0.0 and 10.0");
            }
        }

        public void displayStudentDetails() {
            System.out.println("Roll Number : " + rollNumber);
            System.out.println("Name        : " + name);
            System.out.println("CGPA        : " + CGPA);
            System.out.println("-----------------------------");
        }
    }

  
    static class PostgraduateStudent extends Student {
        private String researchTopic;

        public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
            super(rollNumber, name, CGPA);
            this.researchTopic = researchTopic;
        }

        public void displayPostgradDetails() {
            System.out.println("Postgraduate Student");
            System.out.println("Name          : " + name); 
            System.out.println("Research Topic: " + researchTopic);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Amit Sharma", 8.2);
        student1.displayStudentDetails();

        student1.setCGPA(9.1);
        System.out.println("Updated CGPA: " + student1.getCGPA());
        student1.displayStudentDetails();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Sneha Verma", 9.5, "Machine Learning");
        pgStudent.displayPostgradDetails();
        pgStudent.displayStudentDetails();
    }
}
