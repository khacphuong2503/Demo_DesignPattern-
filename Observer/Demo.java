package DP.Observer;

public class Demo {
    public static void main(String[] args) {
        FootballMatch match = new FootballMatch("Barcelona", "Real Madrid");
        ScoreboardDisplay scoreboardDisplay = new ScoreboardDisplay(match);
        CommentaryDisplay commentaryDisplay = new CommentaryDisplay(match);

        match.goalScored("Barcelona");
        match.goalScored("Real Madrid");
        match.goalScored("Barcelona");
    }
}