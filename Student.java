class Student {
    private String USN;
    private String name;
    private int age;

    
    public Student(String USN, String name, int age) {
        this.USN = USN;
        this.name = name;
        this.age = age;
    }

    public void displayStudentDetails() {
        System.out.println("Student Information:");
        System.out.println("USN: " + USN);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// UGStudent class inheriting from Student
class UGStudent extends Student {
    private int semester;
    private double fees;
    private double CGPA;
    private double stipend;

    // Constructor for UGStudent class
    public UGStudent(String USN, String name, int age, int semester, double fees, double CGPA, double stipend) {
        super(USN, name, age);
        this.semester = semester;
        this.fees = fees;
        this.CGPA = CGPA;
        this.stipend = stipend;
    }

    // Method to display UGStudent details
    public void displayUGStudentDetails() {
        displayStudentDetails(); // Inherited method to display Student details
        System.out.println("UG Student Information:");
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
        System.out.println("CGPA: " + CGPA);
        System.out.println("Stipend: " + stipend);
    }

    public static void main(String[] args) {
        UGStudent ugStudent = new UGStudent("117", "Aaamir", 20, 3, 100000, 8.5, 6000.0);
        
        ugStudent.displayUGStudentDetails();
    }
}
