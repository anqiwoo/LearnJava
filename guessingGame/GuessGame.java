public class GuessGame {
    // GuessGame has three instance variables for the three Player objects
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        // Creates three Player objects and assign them to the three Player instance variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // declare three variables to hold the three guesses the Playeers make
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // declare three boolean variables to hold a true or false based on the player's answer
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // make a "target" number that the three players need to guess!
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I am thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guesseed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            // see if any player gets it right...
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!!!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have another exciting try!");
            }
        }
    }
}
