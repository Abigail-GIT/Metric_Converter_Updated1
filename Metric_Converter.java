import java.util.Scanner;
public class Metric_Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double a;
        int b;
        double metricVal;

        System.out.println("Welcome to metric converter!");
        System.out.println("Please input enter a value that you would like to convert.");
        System.out.println("Enter '-1' to exit the program.");

        a = input.nextDouble();
        
        System.out.println("Select a conversion (1/2/3/4):");
        System.out.println("1. Centimeters to Inches");
        System.out.println("2. Meters to Feet");
        System.out.println("3. Kilometers to Miles");
        System.out.println("4. Kilograms to Pounds");

        b = input.nextInt();

        if (b == 1){
            metricVal = a * 0.393701;
            System.out.println(a + " centimeters = " + metricVal + " inches.");
        }
        else if (b == 2){
            metricVal = a * 3.28084;
            System.out.println(a + " meters = " + metricVal + " feet.");
        }
        else if (b == 3){
            metricVal = a * 0.621371;
            System.out.println(a + " kilometers = " + metricVal + " miles.");
        }
        else if (b == 4){
            metricVal = a * 2.20462;
            System.out.println(a + " kilograms = " + metricVal + " pounds");
        }
        else if (b == -1){
            System.out.println("Goodbye.");
        }
        else{
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
