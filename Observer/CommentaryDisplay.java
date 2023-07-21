package DP.Observer;

public class CommentaryDisplay implements Observer {
    private FootballMatch match;

    public CommentaryDisplay(FootballMatch match) {
        this.match = match;
        match.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Commentary: " + match.getHomeTeam() + " " + match.getHomeScore() + " - " + match.getAwayScore() + " " + match.getAwayTeam());
    }
}
