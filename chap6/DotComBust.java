/** The game class.
 *  Makes DotComs, get users input, plays until all DotComs are dead.  */
import java.util.*;

public class DotComBust {
    // Dclares and instantiates the GameHelper instance variable
    private GameHelper helper = new GameHelper();
    // Dclares and instantiates an ArrayList to hold the list of DotComs
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    // Declares an int variabel to hold the number of user guesses
    private int numOfGuesses = 0;

    // Makes three DotCom objects with names and locations.
    // Display brief instructions to the user.
    public void setUpGame() {
        // create three DotCom objects

        // set a name for each DotCom

        // add the DotComs to the dotComList

        // repeat with each of the DotCom objects in the dotComList ArrayList
            // call the placeDotCom() method on the helper object

            // set the location for each DotCom
    }

    // Asks the player for guesses and calls the checkUserGuess() method
    // until all the DotCom objects are dead.
    public void startPlaying() {
        // repeat while any DotComs exists
            // get user input by calling the helper getUserInput() method

            // evaluate the user's guess by checkUserGuess() method
    }

    // loops through all remaining DotCom objects and
    // calls each DotCom object's checkYourself() method.
    public void checkUserGuess() {
        // increment the number of user guesses in the numOfGuesses

        // set the local result variable (a String) to "miss"
        // (assuming that the user's guess will be a miss.)

        // repeat with each of the DotCom Objects in the dotComList ArrayList
            // evaluate the user's guess by calling the DotCom's checkYourself() method.

            // set the result variable to "hit" or "kill" if appropriate

            // if the result is "kill", remove the DotCom from the dotComList

        // display the result value to the user
    }

    // prints a message about the users' performance,
    // based on how many guesses it took to sink all of the
    // DotCom objects.
    public void finishGame() {
        // display a generic "game over" message, then:

        // if number of user guesses is small,
            // display a congratulations message
        // else
            // display an insulting one

    }

    public staic void main(String[] args) {


        // Create three DotComs

        // Give each of the three DotComs a name

        // Put three DotComs on a 7x7 grid

        // Check each user guess with all three DotComs

        // Keep playing the game until there are no more live DotComs

        // Get out of main :)
    }
}
