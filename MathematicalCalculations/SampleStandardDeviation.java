public class SampleStandardDeviation {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int max = 1000;
        int min = 1;
        int range = max - min + 1;
        int sum = 0;
        int value = 0;
        double avg = 0;
        int sumsquarvalue = 0;
		int sumq = 0;
		


        for (int i = 1; i <= n; i++) {
            value = (int) (Math.random() * range) + min;
            sum += value;
			sumsquarvalue += value * value;
            System.out.println("Random number: " + value);
            
        }
		/*sqrt{ [ n(x1^2 + x2^2...) - (x1 + x2...)^2] / n(n-1) } different formula for calculating SD-for no arrays */
		sumq=sum*sum;
        avg = sum / n;
        System.out.println("AVG value is: " + (avg));
		double sd;
		sd=((n*sumsquarvalue)-sumq)/ (n*(n-1));
		System.out.println("Sample standard deviation is: " + Math.sqrt(sd));		
    }
}
