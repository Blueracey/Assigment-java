import java.util.Scanner;

public  class DicerollerClasses {






static void asktorollagain() {
    Scanner input = new Scanner(System.in);
    System.out.println("Roll the dice again? (y/n):");
    String reset = input.next();
    if (reset.equals("y")) {
        start();
    } else if (reset.equals("Y")) {
        start();
    } else if (reset.equals("N")) {
        System.out.println("Exiting");
    } else if (reset.equals("n")) {
        System.out.println("Exiting");
    } else {
        System.out.println("That was not a valid input for the request");
        asktorollagain();
    }






}



public static void start(){


    DiePair role = new DiePair();
    role.roll();
    role.sum();
    role.printroll();
    asktorollagain();


}

    public static void main(String[] args) {
        start();
    }

}














