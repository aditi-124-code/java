public class Student {
    private int studentId;
    private String studentName;
    public Student(int id, String name) {
        studentId = id;
        studentName = name;
    }
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(102, "Bob");
        System.out.println("Student 1: ID=" + student1.getStudentId() + ", Name=" + student1.getStudentName());
        System.out.println("Student 2: ID=" + student2.getStudentId() + ", Name=" + student2.getStudentName());
    }
}

