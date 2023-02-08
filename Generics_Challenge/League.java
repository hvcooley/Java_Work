package dev.cooley;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Player> {

    private String name;

    private ArrayList<Team<T>> teams;

    public League(){
        this("Unamed League");
    }

    public League(String name){
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public void addTeam(Team<T> newTeam){
        if (teams.contains(newTeam)){
            System.out.println("Cannot add " + newTeam.getName() + " because it is already in the league");
        }
        teams.add(newTeam);
    }

    //function to record a result

    public void recordResult(Team<T> team1, Team<T> team2, int score1, int score2){
        team1.matchResult(team2, score1, score2);
    }

    private void sortTable(){
        Collections.sort(teams);
    }

    public void printTable(){
        sortTable();
        System.out.println(this.name + " Table: " );
        System.out.println("Pos__________Team____________Points___Games_Played" );
        for (int i = 0; i < teams.size(); i++){
            Team<T> currTeam = teams.get(i);
            System.out.printf("%2d     %20s %5d %10d %n", i+1, currTeam.getName(), currTeam.ranking(), currTeam.getPlayed());
            //System.out.println((i+1) + ".   " + currTeam.getName() + "         " + currTeam.ranking() + "         " + currTeam.getPlayed());
        }
    }
}
