import java.util.Scanner;
public class CorbyBromlingRectanglecalcuator {


    // you ever make something and are just disappointed it worked
    //declare variables globally so that they can be shared between the 4 functions
    public static float Length = 0;
    public static float Width = 0;
    public static void main(String[] args) {


        Lengthcalc();
    }
    static void reset () {  // for asking to reset
        Scanner input = new Scanner(System.in);
        System.out.println("Continue? (y/n): ");
        String reset = input.next();
        if (reset.equals("y")) {
            Lengthcalc();
        } else if (reset.equals("Y")) {
            Lengthcalc();
        } else if (reset.equals("N")) {
            System.out.println("Exiting");
        } else if (reset.equals("n")) {
            System.out.println("Exiting");
        } else {
            System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
            reset();
        }
    }
    static void Widthcalc() {  // promps width from the user
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter width");
            Width = input.nextFloat();
            if (Width < 0) {
                System.out.println("ERROR! Number must be greater then 0.0");
                Widthcalc(); //resets when an invalid option is picked

            } else if (Width > 1000000.0) {
                System.out.println("ERROR! Number must be less then 1000000.0:");
                Widthcalc();//resets when an invalid option is picked

            }
            else {
                Calculate(); //moving on to the next function to add width and lenght
            }
        } catch (Exception b) {
            System.out.println("ERROR! Invalid decimal value.Try again.");
            Widthcalc();//resets when an invalid option is picked


        } }
    static void Lengthcalc() { //ask for the Length


        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter length:");
            try {
                Length = input.nextFloat();
                if (Length < 0) {
                    System.out.println("ERROR! Number must be greater then 0.0");
                    Lengthcalc();//resets when an invalid option is picked
                } else if (Length > 1000000.0) {
                    System.out.println("ERROR! Number must be less then 1000000.0:");
                    Lengthcalc();//resets when an invalid option is picked
                } else {
                    Widthcalc(); //moves on to asking  for width
                }

            } catch (Exception a) {
                System.out.println("ERROR! Invalid decimal value.Try again.");
                Lengthcalc();//resets when an invalid option is picked

            }
        }

    }
        static void Calculate(){ //adds everything together and calls the reset
            float Area = Length * Width;
            float Perimeter = Length * 2 + Width * 2;

            System.out.println("Area:          " + Area);
            System.out.println("Perimeter:        " + Perimeter);
            reset();


        }}



