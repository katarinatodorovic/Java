/*Boys and girls. A couple beginning a family decides to keep
having children until they have at least one of either sex.
 Estimate the average number of children they will have via
 simulation. Also estimate the most common outcome
 (record the frequency counts for 2, 3, and 4 children, and also for 5 and above).
Assume that the probability p of having a boy or girl is 1/2.*/


public class BoysGirlsProbability {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        int sum = 0;
        int counts = 0;
        double average = 0;
        int twoChildren = 0;
        int threeChildren = 0;
        int fourChildren = 0;
        int fiveandabove = 0;
        for (int i = 1; i <= trials; i++) {
            System.out.println("TRIALS " + i + ":");
            int girl = 0;
            int boy = 0;
            sum = boy + girl;

            int numChildren = 0;
            while (sum != 3) {
                counts++;
                double r = Math.random();
                if (r < 0.5) {
                    girl = (int) Math.random();
                    girl++;
                    numChildren++;
                    System.out.println("Girl");
                } else {
                    boy = (int) (Math.random() + 1);
                    boy++;
                    numChildren++;
                    System.out.println("Boy");
                }
                sum = boy + girl;
            }
            if (numChildren == 2) twoChildren += 1;
            else if (numChildren == 3) threeChildren += 1;
            else if (numChildren == 4) fourChildren += 1;
            else if (numChildren >= 5) fiveandabove += 1;
            System.out.println("Num of Children: " + numChildren);
        }
		double twof=((double)(twoChildren*100)/trials);
		double threef=((double)(threeChildren*100)/trials);
		double fourf=((double)(fourChildren*100)/trials);
		double fiveandabovef=((double)(fiveandabove*100)/trials);
        System.out.println("Total number of cases with two children: " + twoChildren + "; " + twof + "%");
        System.out.println("Total number of cases with three children: " + threeChildren + "; " + threef + "%");
        System.out.println("Total number of cases with four children: " + fourChildren + "; " + fourf + "%");
        System.out.println("Total number of cases with five and above children: " + fiveandabove + "; " + fiveandabovef + "%");
        average = ((double) counts / trials);
        System.out.println("Total number of children is : " + counts);
        System.out.println("AVERAGE NUMBER OF CHILDREN IS : " + average);
    }
}
