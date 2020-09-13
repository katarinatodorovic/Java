package students;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int num;

        Student student = new Student(20200001, "History", 51);
        student.setDepartment("Anthropology");
        student.setFirstNameLastName("Milka Milic");

        Student student2 = new Student(20200002, "Biology", 83);
        student2.setFirstNameLastName("Pera Peric");
        student2.setDepartment("Natural Science");
        Student student2_2 = new Student(20200002, "Ethology", 94);
        student2_2.setDepartment("Natural Science");

        Student student3 = new Student(20200003, "Math", 50);
        student3.setFirstNameLastName("Ljubica Ljubic");
        student3.setDepartment("Science");

        StudentsList sm = new StudentsList();
        sm.passExam(student);
        sm.passExam(student2);
        sm.passExam(student2_2);
        sm.passExam(student3);
		
		sm.displayALLSTUDENTSData();
        System.out.println("Enter the student ID number: ");
        sm.displayStudentData(num = scanner.nextInt());
        


    }
}
