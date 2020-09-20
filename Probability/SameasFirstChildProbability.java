public class SameasFirstChildProbability {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        int counts = 0;
        int twoChildren = 0;
        int threeChildren = 0;
        int fourChildren = 0;
        int fiveandabove = 0;
        double average = 0;
        int girlasFirst = 0;
        int boyasFirst = 0;
        int totalBoy = 0;
        int totalGirl = 0;

        for (int i = 1; i <= trials; i++) {
            int girl = 0;
            int boy = 0;
            System.out.println("\nTRIALS " + i + ":");
            double r = Math.random();
            int numChildren = 0;
            if (r < 0.5) {
                girl++;
                girlasFirst++;
                counts++;
                numChildren++;
                totalGirl++;
                System.out.println("GIRL AS FIRST CHILD " + girl);
                while (girl != 2) {
                    r = Math.random();
                    if (r < 0.5) {
                        girl++;
                        counts++;
                        numChildren++;
                        totalGirl++;
                        System.out.println("ANOTHER GIRL " + girl);
                    } else {
                        boy++;
                        totalBoy++;
                        counts++;
                        numChildren++;
                        System.out.println("BOY " + boy);
                    }
                }
                System.out.println("\nGIRLS: " + girl);
                System.out.println("Boys: " + boy);
                System.out.println("Number of children:  " + numChildren);

            } else {
                boy++;
                boyasFirst++;
                counts++;
                numChildren++;
                totalBoy++;
                System.out.println("BOY AS FIRST CHILD " + boy);
                while (boy != 2) {
                    r = Math.random();
                    if (r < 0.5) {
                        girl++;
                        counts++;
                        numChildren++;
                        totalGirl++;
                        System.out.println("GIRL " + girl);
                    } else {
                        boy++;
                        counts++;
                        numChildren++;
                        totalBoy++;
                        System.out.println("ANOTHER BOY " + boy);
                    }
                }
                System.out.println("\nGirls: " + girl);
                System.out.println("BOYS: " + boy);
                System.out.println("Number of children: " + numChildren);
            }
            if (numChildren == 2) twoChildren += 1;
            else if (numChildren == 3) threeChildren += 1;
            else if (numChildren == 4) fourChildren += 1;
            else if (numChildren >= 5) fiveandabove += 1;
        }
		double twof=((double)(twoChildren*100)/trials);
		double threef=((double)(threeChildren*100)/trials);
		double fourf=((double)(fourChildren*100)/trials);
		double fiveandabovef=((double)(fiveandabove*100)/trials);
        System.out.println("\nGirl as first child: " + girlasFirst);
        System.out.println("Boy as first child: " + boyasFirst);
        System.out.println("Boys TOTAL: " + totalBoy);
        System.out.println("Girls TOTAL: " + totalGirl);
        System.out.println("Total number of cases with two children: " + twoChildren + "; " + twof + "%");
        System.out.println("Total number of cases with three children: " + threeChildren + "; " + threef + "%");
        System.out.println("Total number of cases with four children: " + fourChildren + "; " + fourf + "%");
        System.out.println("Total number of cases with five and above children: " + fiveandabove + "; " + fiveandabovef + "%");
        System.out.println("TOTAL NUMBE OF CHILDREN " + counts);
        average = ((double) counts / trials);
        System.out.println("AVERAGE NUMBER OF CHILDREN IS : " + average);
    }
}
