public class SquareRoot {
    public static void main(String[] args) {

       int count = 1;
        for (float j = 1; j <= 10; j++) {
            for (float i = 1; i <= 10; i += 0.000001) {
                if (Math.abs(i * i - j) < 0.00001) {
                    System.out.println(i);
                    System.out.println(" For: " + j);
                    if (j == count) {
                        break;
                    }
                }
            }
            count++;
        }
    }

}



