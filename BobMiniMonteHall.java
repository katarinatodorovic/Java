
public class BobMiniMonteHall {

    public static void main(String[] args) {
       int trials = Integer.parseInt(args[0]);  
       int wins = 0;                            

       for (int i = 1; i <=trials; i++) {
		   System.out.println("Try " +i+": ");

            int a = (int) (100 * Math.random());
            System.out.println("First number " + a);
            int b = (int) (100 * Math.random());
            System.out.println("Second number " + b);

            int max = Math.max(a, b);
			System.out.println("MAX " + max);
            int min = Math.min(a, b);
			System.out.println("MIN " + min);
			
			double r=  Math.random();
			if (r>0.4) {
				int bob=max;
				System.out.println("BOB choose biger umber" + bob);
				wins++;
			}
			else {
				int bob=min;
				System.out.println("BOB choose smaller number" +bob);
			}
	   }
        System.out.println("Fraction of games won = " + 1.0 * wins / trials);
    }

}


