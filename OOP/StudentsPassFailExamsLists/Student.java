package students;

public class Student {
    private String firstNameLastName;
    private int uniqueNumber;
    private String department;
    private String exam;
    private double resultOfFinalExam;

    public Student(int uniqueNumber, String exam, double resultOfFinalExam) {
        this.uniqueNumber = uniqueNumber;
        this.exam = exam;
        this.resultOfFinalExam = resultOfFinalExam;
    }

    public String getFirstNameLastName() {
        return firstNameLastName;
    }

    public void setFirstNameLastName(String firstNameLastName) {
        if (firstNameLastName != null && !firstNameLastName.equals("")) {
            this.firstNameLastName = firstNameLastName;
        } else System.out.println("The name you entered isn't correct");

    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        if (uniqueNumber > 0) {
            this.uniqueNumber = uniqueNumber;
        } else System.out.println("The number you entered isn't correct");

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null) {
            this.department = department;
        } else System.out.println("The department you entered isn't correct");

    }

    public double getResultOfFinalExam() {
        return resultOfFinalExam;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        if (exam != null && resultOfFinalExam > 51) {
            this.exam = exam;
        } else System.out.println("The name you entered isn't correct");

    }

    public void setResultOfFinalExam(double resultOfFinalExam) {
        if (resultOfFinalExam >= 51 && exam != null) {
            this.resultOfFinalExam = resultOfFinalExam;
        } else System.out.println("The number you entered isn't correct");
    }

    @Override
    public String toString() {
        return getFirstNameLastName() + " [ " + getUniqueNumber() + " ]" +
                ", " + getDepartment() + " - " + getExam() + ": " + getResultOfFinalExam() + "%";
    }
}
