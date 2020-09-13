package students;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {

    private List<Student> students = new ArrayList<Student>();


    public void passExam(Student student) {
        if (student.getResultOfFinalExam() >= 51) {
            students.add(student);
        } else {
            System.out.println("That student didn't pass exam. " + student);
            students.remove(student);
        }
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void displayStudentData(int uniqueNumber) {
        boolean thereIs = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getUniqueNumber() == uniqueNumber) {
                System.out.println(students.get(i));
                thereIs = true;
            }
        }
        if (!thereIs) {
            System.out.println("There is no student with that number.Enter correct unique student number.");
        }
    }

    public void displayALLSTUDENTSData() {
        for (int i = 0; i < students.size(); i++) {
            if (students.size() == 1) {
                System.out.println(students);
            } else if (students.get(i) == students.get(students.size() - 1)) {
                System.out.println(students.get(students.size() - 1) + ".");
            } else if (students.size() != 1) {
                System.out.println(students.get(i) + ",");
            }
        }
    }
}

