/*Write an alternate version Program Binary2.java that is based
on the following method: Write 1 if n is odd, 0 if n is even.
Divide n by 2, throwing away the remainder. Repeat until n = 0
 and read the answer backwards. Use % to determine whether n
 is even, and use string concatenation to form the answer in reverse order.*/
 public class DecimalIntoBinaryConverter {
    public static void main(String[] args) { 

        int n = Integer.parseInt(args[0]);
		String r = "";
		int remainder;	 

        while (n > 0) {
			
		remainder = n % 2;
           if (n%2==0) {          
				r += '0';
            }

            else {
				r += '1';
                n -= remainder;
            }
             n /= 2;
        }
		String result = new StringBuffer(r).reverse().toString();
        System.out.print(result);

    }

}
