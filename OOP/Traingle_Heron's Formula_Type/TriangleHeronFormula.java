public class Triangle {
    private int a;
    private int b;
    private int c;

    public TriangleHeronFormula(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public boolean isTriangle(Triangle triangle) {
        boolean isTrue = false;
        if (triangle.getA() + triangle.getB() >= triangle.getC() &&
                triangle.getB() + triangle.getC() >= triangle.getA() &&
                triangle.getC() + triangle.getA() >= triangle.getB()) {
            isTrue = true;
        }
        return isTrue;
    }
    public double areaOfTriangleHeronsFormula(Triangle triangle) {
        if (isTriangle(triangle)) {
            double s = (triangle.getA() + triangle.getB() + triangle.getC()) / 2.0;
            return Math.sqrt((s * (s - triangle.getA()) * (s - triangle.getB()) * (s - triangle.getC())));
        } else return -1;
    }

    public void canBeRightTriangle(Triangle triangle) {
        if ((
                triangle.getA() * triangle.getA() +
                        triangle.getB() * triangle.getB() ==
                        triangle.getC() * triangle.getC()) ||
                (triangle.getB() * triangle.getB() +
                        triangle.getC() * triangle.getC() ==
                        triangle.getA() * triangle.getA()) ||
                (triangle.getC() * triangle.getC() +
                        triangle.getA() * triangle.getA() ==
                        triangle.getB() * triangle.getB())) {
            System.out.println("Can be right triangle.");
        } else System.out.println("Triangle can not be right triangle.");
    }

    public boolean canEquilateral(Triangle triangle) {
        boolean isEquilateral = false;
        if (triangle.getA() ==
                triangle.getB() &&
                triangle.getB() ==
                        triangle.getC()) {
            isEquilateral = true;
        }return isEquilateral;
    }

    public void canIsosceles(Triangle triangle) {
        if (
                ( triangle.getA() ==
                        triangle.getB() ||
                        triangle.getB() ==
                                triangle.getC() ||
                        triangle.getC() == triangle.getA())&& !canEquilateral(triangle)) {
            System.out.println("Can be isosceles triangle.");
        } else System.out.println("Triangle can not be isosceles triangle.");
    }

}
