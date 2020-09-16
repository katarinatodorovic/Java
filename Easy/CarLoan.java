

public class CarLoan {

    public static void main(String[] args) {


        double Yyears      = Double.parseDouble(args[0]);
		double Pdollarloan = Double.parseDouble(args[1]); 
		double Rinterest   = Double.parseDouble(args[2]);
		
		double n = 12*Yyears;
		double r = (Rinterest/100)/12;
		
		payment = (Pdollarloan * r) / (1 - Math.pow(1+r, -n));
		double interest = payment * n - Pdollarloan;

		System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
    }
}
