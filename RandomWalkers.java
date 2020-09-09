public class RandomWalkers {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		int sumOfSteps = 0;
		double averageSteps = 0;

		for (int i = 1; i <= trials; i++) {

			int x = 0;
			int y = 0;
			int distance = 0;
			int steps = 0;

			while (distance != r) {
				double k = Math.random();
				if (k < 0.25) x--;
				else if (k < 0.50) x++;
				else if (k < 0.75) y--;
				else if (k < 1.00) y++;
				steps++;
				distance = Math.abs(x) + Math.abs(y);
			}
			sumOfSteps = sumOfSteps + steps;
		}
		averageSteps = ((double) sumOfSteps / trials);
		System.out.println("Average number of steps =  " + averageSteps);
	}
}