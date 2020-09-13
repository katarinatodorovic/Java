import java.util.ArrayList;

/*Napraviti klasu Ocena. Potrebno je da sadrzi broj poena koje je neko imao
 na ispitu i metodu koja vraca koja ocena je u pitanju. Sadrzi naziv predmeta,
  i rok u kom je odrzan. Klasa ocena treba da ima i metodu kojoj se prosledjuje
   niz ocena koja racuna i vraca prosek. Prethodnu klasu testirati.
 */
public class Grade {
    private String courseName;
    private double numOfPoints;
    private String examTerm;
    private static ArrayList<Grade> grades = new ArrayList<>();
    private static ArrayList<Integer> gradesForGPA = new ArrayList<>();
    private static ArrayList<Grade> failedExam = new ArrayList<>();
    private static ArrayList<Grade> passedExam = new ArrayList<>();


    public Grade(String courseName, double numOfPoints, String examTerm) {
        if (courseName != null) {
            this.courseName = courseName;
        } else System.out.println("You didn't entered course name.");
        if (numOfPoints < 51) {
            System.out.println("The student fail the exam.");
        } else this.numOfPoints = numOfPoints;

        if (examTerm != null) {
            this.examTerm = examTerm;
        } else System.out.println("You didn't entered term in which exam was taken.");
    }

    public double getNumOfPoints() {
        return numOfPoints;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getExamTerm() {
        return examTerm;
    }

    public static void setGrade(ArrayList<Grade> grades) {
        Grade.grades = grades;
    }


    public static ArrayList<Grade> getGrades() {
        return grades;
    }

    public static void addGrade(Grade grade) {
        if (grade != null) {
            grades.add(grade);
        }
    }

    public static ArrayList<Integer> getGradesForGPA() {
        return gradesForGPA;
    }

    public static void setGradesForGPA(ArrayList<Integer> gradesForGPA) {
        Grade.gradesForGPA = gradesForGPA;
    }

    public static ArrayList<Grade> getFailedExam() {
        return failedExam;
    }

    public static void setFailedExam() {

        for (int i = 0; i < Grade.getGrades().size(); i++)
            if (Grade.getGrades().get(i).getNumOfPoints() < 51) {
                failedExam.add(Grade.getGrades().get(i));
            }
    }

    public static ArrayList<Grade> getPassedExam() {
        return passedExam;
    }

    public static void setPassedExam() {
        for (int i = 0; i < Grade.getGrades().size(); i++)
            if (Grade.getGrades().get(i).getNumOfPoints() > 51) {
                passedExam.add(Grade.getGrades().get(i));
            }
    }

    public int setNumOfPoints(double numOfPoints) {
        this.numOfPoints = numOfPoints;
        int grade = 0;
        if (numOfPoints < 51) {
            grade = -1;
        }
        if (numOfPoints >= 51 && numOfPoints <= 60) {
            grade = 6;
            gradesForGPA.add(grade);
        }
        if (numOfPoints >= 61 && numOfPoints <= 70) {
            grade = 7;
            gradesForGPA.add(grade);
        }
        if (numOfPoints >= 71 && numOfPoints <= 80) {
            grade = 8;
            gradesForGPA.add(grade);
        }
        if (numOfPoints >= 81 && numOfPoints <= 90) {
            grade = 9;
            gradesForGPA.add(grade);
        }
        if (numOfPoints >= 91 && numOfPoints <= 100) {
            grade = 10;
            gradesForGPA.add(grade);
        }
        return grade;
    }

    public void gradeOutput() {
        int grade = setNumOfPoints(this.numOfPoints);
        if (grade == -1) {
            System.out.println("The student fail the exam");
        }
        if (grade == 6) {
            System.out.println("The student grade is 6.");
        }
        if (grade == 7) {
            System.out.println("The student grade is 7.");
        }
        if (grade == 8) {
            System.out.println("The student grade is 8.");
        }
        if (grade == 9) {
            System.out.println("The student grade is 9.");
        }
        if (grade == 10) {
            System.out.println("The student grade is 10.");
        }
    }

    public static double gradePointAverage() {

        int sum = 0;
        for (int m : gradesForGPA) {
            sum += m;
        }
        return sum * 1.0 / gradesForGPA.size();
    }

    public static double gradePointAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int a : grades) {
            sum += a;
        }
        return sum * 1.0 / grades.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return String.valueOf(sb.append(getCourseName()).append(": ").append(getNumOfPoints()).
                append(" term: ").append(getExamTerm()));
    }
}
