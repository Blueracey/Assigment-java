import java.util.Scanner;

public class Diceroller {

    int timesRun = 1;
public static void main(String[] args) {
    start();


}

static void start(){ //first function so i can loop it if I want
    asktoroll();

}


    static void rollTheDice() { // roll the die function
        int multiplier= 6 ; // multiplier of the random die roll to make it a d6
        int random1 = (int) (Math.random() * multiplier);
        int random2 = (int) (Math.random() * multiplier);
        System.out.println(random1);
        System.out.println(random2);
        int sum = random1 + random2;

        switch(sum){ //triggers on the total of the two roles
            case 12:
                System.out.println("Boxcards!");
                break;
            case 2:
                System.out.println("Snakeyes!");
                break;
            default:
                System.out.println("Total:" + sum);






        }
        // ask to roll again triggers no matter result
        asktorollagain();


    }



    static void asktorollagain() { //ask if you want to roll but this time with again in the ask
        Scanner input = new Scanner(System.in);//scaner activation
        System.out.println("Roll the dice again? (y/n):");
        String reset = input.next(); //again resused this part of the function from a privious assigment
        if (reset.equals("y")) {
            rollTheDice();
        } else if (reset.equals("Y")) {
            rollTheDice();
        } else if (reset.equals("N")) {
            System.out.println("Exiting");
        } else if (reset.equals("n")) {
            System.out.println("Exiting");
        } else {
            System.out.println("That was not a valid input for the request");
            asktorollagain();
        }}


static void asktoroll() {// ask if you want to
    Scanner input = new Scanner(System.in); //scaner activation
    System.out.println("Roll the dice? (y/n):");
    String reset = input.next();
    if (reset.equals("y")) {
        rollTheDice();
    } else if (reset.equals("Y")) {
        rollTheDice();
    } else if (reset.equals("N")) {
        System.out.println("Exiting");
    } else if (reset.equals("n")) {
        System.out.println("Exiting");
    } else {
        System.out.println("That was not a valid input for the request");
        asktoroll();
    }}




}




