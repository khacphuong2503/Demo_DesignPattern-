package DP.Observer;

public class ScoreboardDisplay implements Observer {
    private FootballMatch match;

    public ScoreboardDisplay(FootballMatch match) {
        this.match = match;
        match.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Scoreboard: " + match.getHomeTeam() + " " + match.getHomeScore() + " - " + match.getAwayScore() + " " + match.getAwayTeam());
    }
}
