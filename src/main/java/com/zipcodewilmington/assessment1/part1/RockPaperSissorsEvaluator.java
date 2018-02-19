package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        if (handSign.equals("rock")) {
            return "paper";
        } else if (handSign.equals("paper")){
            return "scissors";
        } else if (handSign.equals("scissors")) {
            return "rock";
        } else
        return null;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        if (handSign.equals("rock")) {
            return "scissors";
        } else if (handSign.equals("paper")){
            return "rock";
        } else if (handSign.equals("scissors")) {
            return "paper";
        } else
            return null;    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        switch (handSignOfPlayer1) {
            case "rock":
                if (handSignOfPlayer2.equals("scissors")) {
                    return handSignOfPlayer1;
                } else if (handSignOfPlayer2.equals("paper")) {
                    return handSignOfPlayer2;
                } else return "tie";
                //break;

            case "paper":
                if (handSignOfPlayer2.equals("scissors")) {
                    return handSignOfPlayer2;
                } else if (handSignOfPlayer2.equals("rock")) {
                    return handSignOfPlayer1;
                } else return "tie";
                //break;

            case "scissors":
                if (handSignOfPlayer2.equals("paper")) {
                    return handSignOfPlayer1;
                } else if (handSignOfPlayer2.equals("rock")) {
                    return handSignOfPlayer2;
                } else return "tie";
                //break;

        }
        return "invalid entry";
    }
}
