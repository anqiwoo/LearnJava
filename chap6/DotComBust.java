/** The game class.
 *  Makes DotComs, get users input, plays until all DotComs are dead.  */
import java.util.*;

public class DotComBust {
    // Declares and instantiates the GameHelper instance variable
    private GameHelper helper = new GameHelper();
    // Declares and instantiates an ArrayList to hold the list of DotComs
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    // Declares an int variabel to hold the number of user guesses
    private int numOfGuesses = 0;

    // Makes three DotCom objects with names and locations
    // Display brief instructions to the user.
    private void setUpGame() {
        // create three DotCom objects
        DotCom one = new DotCom();
        DotCom two = new DotCom();
        DotCom three = new DotCom();
        // set a name for each DotCom
        one.setName("Pets.com");
        two.setName("eToys.com");
        three.setName("Go2.com");
        // add the DotComs to the dotComList
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        // repeat with each of the DotCom objects in the dotComList ArrayList
        for (DotCom dotComToSet : dotComsList) {
            // call the placeDotCom() method on the helper object
            ArrayList<String> newLocation = helper.placeDotCom(3);
            // set the location for each DotCom
            dotComToSet.setLocationCells(newLocation);
        }
    }

    // Asks the player for guesses and calls the checkUserGuess() method
    // until all the DotCom objects are dead.
    private void startPlaying() {
        // repeat while any DotComs exists
        while (!dotComsList.isEmpty()) {
            // get user input by calling the helper getUserInput() method
            String userGuess = helper.getUserInput("Enter a guess");
            // evaluate the user's guess by checkUserGuess() method
            checkUserGuess(userGuess);
        }
        finishGame();
    }


    // loops through all remaining DotCom objects and
    // calls each DotCom object's checkYourself() method.
    private void checkUserGuess(String userGuess) {
        // increment the number of user guesses in the numOfGuesses
        numOfGuesses++;
        // set the local result variable (a String) to "miss"
        // (assuming that the user's guess will be a miss.)
        String result = "miss";
        // repeat with each of the DotCom Objects in the dotComList ArrayList
        for (DotCom dotComToTest : dotComsList) {
            // evaluate the user's guess by calling the DotCom's checkYourself() method.
            // set the result variable to "hit" or "kill" if appropriate
            result = dotComToTest.checkYourself(userGuess);
            // if the result is "kill", remove the DotCom from the dotComList
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        // display the result value to the user
        System.out.println(result);
    }

    // prints a message about the users' performance,
    // based on how many guesses it took to sink all of the
    // DotCom objects.
    private void finishGame() {
        // display a generic "game over" message, then:
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        // if number of user guesses is small,
        if (numOfGuesses <= 18) {
            // display a congratulations message
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
        // else
            // display an insulting one
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] args) {
        // create the game object
        DotComBust game = new DotComBust();
        // tell the game object to set up the game
        game.setUpGame();
        // tell the game object to start the main game play loop (keeps asking for user input and chekcing the guess)
        game.startPlaying();
    }
}
