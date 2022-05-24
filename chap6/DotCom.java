/** The actual DotCom objects.
 * DotComs know their name, location, and
 * how to check a user guess for a match. */
import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int idx = locationCells.indexOf(userInput);

        if (idx >= 0) {
            locationCells.remove(idx);
        }

        if (locationCells.isEmpty()) {
            result = "kill";
        } else {
            result = "hit";
        }

        return result;
    }
}
