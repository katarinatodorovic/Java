
public class BMI {
    public static void main(String[] args) {

        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double BMI = weight / (height * height);
        System.out.println(" BMI = " + BMI);
        if (BMI < 15) System.out.print(" Starvation");
        else if (BMI < 17.5) System.out.print(" Anorexic");
        else if (BMI < 18.5) System.out.print(" Underweight");
        else if (BMI >= 18.5 && BMI < 25) System.out.print(" Ideal");
        else if (BMI >= 25 && BMI < 30) System.out.print(" Overweight");
        else if (BMI >= 30.5 && BMI < 40) System.out.print(" Obese");
        else if (BMI > 40) System.out.print(" Morbidly Obese");

    }
}



