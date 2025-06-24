package Constructors.InstanceVsClass;

class Course {

    
    String courseName;
    int duration; 
    double fee;

    
    static String instituteName = "ABC Institute";

  
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("---------------------------------");
    }

    
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
      
        Course c1 = new Course("Java Programming", 8, 5000);
        Course c2 = new Course("Web Development", 10, 6500);

       
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Tech Academy");

       
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
