
import java.util.Scanner;

public class AreaCalculatorClass {






public static void Calculate() {  // Main Function used to do all of the actual equations

    boolean loop = true; // varaible to control the while loop
    while (loop){ //loops so that if an error is found the questions are asked again



    double userWidth; //used for all of the width and radius inputs from the user
        Console Con = new Console();

        String[] allowedV = {"c","s" ,"r"}; //keeps what

    switch (Console.getString("Calculate area of a circle,square, or rectangle? (c/s/r): ",allowedV)) {
        case "c": //case for circle
            Circle objectc = new Circle();


             userWidth = Console.getDouble("Enter Radius:",0,1000); //takes input from the user for radius
            objectc.setRadius(userWidth);
            System.out.println(objectc.toString());
            loop = false;// breaks the loop
            reset();
            break;

        case "s": //case for choosing square
            Square objects = new Square();

             userWidth = Console.getDouble("Enter Width:");//takes input from the user for Width
            objects.setWidth(userWidth);
            System.out.println(objects.toString());
            loop = false;// breaks the loop
            reset();
            break;



        case "r": // case for choosing rectangle
            Rectangle objectr = new Rectangle();

            userWidth = Console.getDouble("Enter Width:");//takes input from the user for Width
            objectr.setWidth(userWidth);

            double userHeight = Console.getDouble("Enter Height:");//takes input from the user for Width
            objectr.setHeight(userHeight);
            System.out.println(objectr.toString());
            loop = false; // breaks the loop
            reset();
            break;

        default:
            System.out.println("Invalid choice please try again"); //should not be called but just in case

    }

    }





}





    static void reset() {
        Scanner input = new Scanner(System.in);
        System.out.println("Continue? (y/n): ");
        String reset = input.next();
        if (reset.equals("y")) {
            Calculate();
        } else if (reset.equals("Y")) {
            Calculate();
        } else if (reset.equals("N")) {
            System.out.println("Exiting");
        } else if (reset.equals("n")) {
            System.out.println("Exiting");
        } else {
            System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
            reset();
        }

    }


    public static void main(String[] args) {
       Calculate();


    }



}