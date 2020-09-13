import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner ns = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the course name: ");
            String courseName = ns.nextLine().toLowerCase().replaceAll("\\s", "");

            System.out.println("Enter the number of points on the exam: ");
            double numOfPoints = sc.nextDouble();
            if (numOfPoints < 0) {
                System.out.println("That input isn't allowed.");
                break;
            }

            System.out.println("Enter the exam term: ");
            String examTerm = ns.nextLine().toLowerCase().replaceAll("\\s", "");

            Grade mark = new Grade(courseName, numOfPoints, examTerm);
            Grade.addGrade(mark);
            mark.setNumOfPoints(numOfPoints);
            mark.gradeOutput();

            System.out.println("To exit program enter 0, to continue press 1.");
            String s = sc.next().toLowerCase().replaceAll("\\s", "");
            if (s.equals("0")) {
                break;

            } else if (s.equals("1")) {
                continue;
            }
            if (!s.equals("0") || !s.equals("1")) {
                System.out.println("That input isn't recognised.");
                break;
            }

        }
        Grade.setFailedExam();
        Grade.setPassedExam();
        System.out.println("You successfully exited from the program.");
        System.out.println("Failed exam: " + Grade.getFailedExam().toString());
        System.out.println("Passed exam: " + Grade.getPassedExam().toString());
        System.out.println("All exam: " + Grade.getGrades().toString());
        System.out.println("GPA: " + Grade.gradePointAverage());

    }

}

