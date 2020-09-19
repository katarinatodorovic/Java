import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        boolean canBe;
        Triangle triangle;
        do {
            while (true) {
                System.out.println("Enter the first side of a triangle: ");
                a = sc.nextInt();
                if (a > 0) {
                    break;
                }
                System.out.println("Enter again, side should be greater then 0:");
            }
            while (true) {
                System.out.println("Enter the second side of a triangle: ");
                b = sc.nextInt();
                if (b > 0) {
                    break;
                }
                System.out.println("Enter again, side should be greater then 0: ");
            }
            while (true) {
                System.out.println("Enter the third side of a triangle:  ");
                c = sc.nextInt();
                if (c > 0) {
                    break;
                }
                System.out.println("Enter again, side should be greater then 0: ");
            }

            System.out.println("a " + a);
            System.out.println("b " + b);
            System.out.println("c " + c);
            triangle = new Triangle(a, b, c);

            canBe = triangle.isTriangle(triangle);

            if (canBe == true) {
                System.out.println("Can be triangle.");
                triangle.canBeRightTriangle(triangle);
                if (triangle.canEquilateral(triangle))System.out.println("Can be equilateral triangle.");
                else System.out.println("Triangle can not be equilateral.");
                triangle.canIsosceles(triangle);
                double area = triangle.areaOfTriangleHeronsFormula(triangle);
                System.out.printf("Area of triangle is: %.2f.\n", area);
                break;
            } else System.out.println("Can not be triangle, try again.");

        } while (!canBe);
    }

}
