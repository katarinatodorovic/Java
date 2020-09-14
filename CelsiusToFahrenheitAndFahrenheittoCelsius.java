
package CelsiusToFahrenheitAndFahrenheittoCelsius;
import java.util.*;
        public class  CelzijusDouble {
            public static void main(String[]args){
        Scanner c = new Scanner (System.in);

        System.out.print("Enter a temperature in Celsius degrees: ");

        double tempC = c.nextDouble();
        double tempF = tempC * 1.8 + 32;

                System.out.println("Temperature in Fahrenheit: " + tempF);



                Scanner a = new Scanner (System.in);

                System.out.println("Enter a temperature in Fahrenheit degrees: ");

                double tempFr = a.nextDouble();
                double tempCz = (tempFr - 32) / 1.8;
                System.out.println("Temperature in Celsius degrees: " + tempCz);
    }
}
