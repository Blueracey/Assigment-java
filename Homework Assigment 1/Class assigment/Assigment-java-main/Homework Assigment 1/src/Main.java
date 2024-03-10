import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initializing variables to track inputs
    String firstName;
    String lastName;
    int birthYear;
    String fullName; // I was not sure if you wanted full name as a variable or not but I decided to play it safe


        //activate the scanner
        Scanner input = new Scanner(System.in);


    // Request for and input of the first name variable
        System.out.print("Enter first name: ");
        firstName = input.next();


    // Request for the input of the last name variable
        System.out.print("Enter Last name: ");
        lastName = input.next();

    // Request for the input of the year of birth variable
        System.out.print("Enter your year of birth: ");
        birthYear = input.nextInt();
    // adding First name and Last name together to make the Full name variable
        fullName = firstName + lastName;

        // printout of the welcome message
        System.out.println("Welcome "+fullName+ "!");

        //registration is complete message
        System.out.println("Your registration is complete.");

        // temporary password message with adding firstname and birth year variable
        System.out.println("your temporary password is: "+ firstName + "*"+birthYear);








        }
    }
