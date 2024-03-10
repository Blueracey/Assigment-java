  class DiePair {

    Dice die1Value = new Dice();

    Dice die2Value = new Dice();
    int Total;


    public void roll() {
        die1Value.roll();
        die2Value.roll();

    }


    public void sum() {
        Total = die1Value.Dicevalue+die1Value.Dicevalue;


    }




    public void printroll(){
        System.out.println(die1Value.Dicevalue );
        System.out.println(die2Value.Dicevalue );
        switch (Total) {
            case 2:
                System.out.println("Snakeyes!");
                break;
            case 12:
                System.out.println("Boxcards!");
                break;
            default:
                System.out.println("Total:" + Total);
        }
}




}
