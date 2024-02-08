import java.util.Scanner;
public class CorbynBromlingTempertureConverter {


    public static void main(String[] args) {
    choice();


    }


    static void choice(){
        byte Choice=0;
        System.out.println("Choose the conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println(" ");
        System.out.println("Enter your choice (1 or 2): ");
        Scanner input = new Scanner(System.in);
        Choice = input.nextByte();

            if(Choice == 1){
                    System.out.println("Celsius");
                    fahrenheitToCelsius ();
        }
                else if (Choice == 2) {
                System.out.println("Fahrenheit");
                celsiusToFahrenheit();

            }
                    else {
                    System.out.println("That input was not valid");
                    choice();
                }
            }








        static void fahrenheitToCelsius (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit: ");
        float FahrenheitToConvert = input.nextFloat();
        float Celsius = (FahrenheitToConvert-32) *5/9;
        System.out.println("Fahrenheit " + FahrenheitToConvert + " is " + Celsius + " in Celsius" );
        reset();

        }

        static void celsiusToFahrenheit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        float celsiusToConvert = input.nextFloat();
        float Fahrenheit = (celsiusToConvert*9/5) +32;
        System.out.println("Celsius " + celsiusToConvert + " is " + Fahrenheit + " in Fahrenheit" );
        reset();
        }


    static void reset (){
        Scanner input = new Scanner(System.in);
        System.out.println("Continue? (y/n): ");
        String reset = input.next();
        if (reset.equals("y")) {
            choice();
        }
        else if (reset.equals("Y")) {
            choice();
        }
        else if (reset.equals("N")) {
            System.out.println("Exiting");
        }
        else if (reset.equals("n")) {
            System.out.println("Exiting");
        }
        else{
            System.out.println("That was not a valid input for the request");
            reset();
        }

    }



}

