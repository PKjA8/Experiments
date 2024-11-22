class Teacher{
    String name;
    String subject;
    int experience;

    Teacher(String name,String subject,int experience){
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    void displayTeacherDetails(){
        System.out.println("Techer Details");
        System.out.println("Name: " + this.name);
        System.out.println("Major: " + this.subject);
        System.out.println("Experience: " + this.experience + " years");
    }
}

class Student extends Teacher{
    int rollNumber;
    String grade;

    public Student(String name, String subject, int experience, int rollNumber, String grade) {
        super(name, subject, experience); 
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public void displayStudentDetails() {
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
public class Teacher_Student {
    public static void main(String[] args) {
        Student student = new Student("Amit", "Mathematics", 8, 38, "A");

        System.out.println("Teacher Details:");
        student.displayTeacherDetails();

        System.out.println("\nStudent Details:");
        student.displayStudentDetails();
    }
}
