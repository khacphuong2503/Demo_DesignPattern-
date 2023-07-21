package DP.Observer;

import java.util.ArrayList;
import java.util.List;

public class FootballMatch implements Subject {
    private List<Observer> observers;
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;

    public FootballMatch(String homeTeam, String awayTeam) {
        this.observers = new ArrayList<Observer>();
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
    }

    public void goalScored(String team) {
        if (team.equals(homeTeam)) {
            homeScore++;
        } else if (team.equals(awayTeam)) {
            awayScore++;
        }
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }
}
