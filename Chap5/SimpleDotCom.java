class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    /* Take a user's guess and return a result
        representing a 'hit', 'miss', or 'kill'.
     */
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] cellLocations) {
        locationCells = cellLocations;
    }


}
