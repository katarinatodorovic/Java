class ConvertsTheFirstArgumentToBaseK {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        //r is string because letters represent numbers from 10 to 15
        String r = "";
        int remainder;
        while (n > 0) {
            remainder = n % k;
            if (k >= 11 && k <= 16) {
                if (remainder == 10)
                    r += 'A';
                else if (remainder == 11)
                    r += 'B';
                else if (remainder == 12)
                    r += 'C';
                else if (remainder == 13)
                    r += 'D';
                else if (remainder == 14)
                    r += 'E';
                else if (remainder == 15)
                    r += 'F';
                else
                    r += remainder;
            } else
                r += remainder;
            n /= k;


        }
		/*print string in reverse order; calculation is performed
		from bigest to smallest number and without it vould be printed
		for e.g. 11 base 2  1101 instead od 1011*/
        String result = new StringBuffer(r).reverse().toString();
        System.out.print(result);

    }
}

