package dev.cooley;

import java.util.ArrayList;

//Syntax for multiple bounds:
//public class Team<extends Player & Coach & Manager>
//Still follows inheritance rules, so first bound must be class and the other bounds need to be interfaces
// or if classes must inherit from first class
public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Boolean addPlayer(T player){
        if (members.contains(player)){
            //Wihtout bounded type parameters , would need to type caste the player object to be of type player
            // bc Java has no idea what object this will be when compiled format: ((type) varName)
            //System.out.println("Player " + ((Player) player).getName() + " is already on the team");


            //Howver, with bounded type parameters, java knows this will be a player object
            System.out.println("Player " + player.getName() + " is already on the team");
            return false;
        }
        else{
            members.add(player);
            //System.out.println("Added player " + ((Player) player).getName() + " to team " + this.name);

            System.out.println("Added player " + player.getName() + " to team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return members.size();
    }

    public void matchResult(Team<T> otherTeam, int ourScore, int theirScore){
        String message;

        if (ourScore > theirScore){
            message = " beat ";
            this.won += 1;
        }
        else if (ourScore == theirScore){
            message = " tied ";
            this.tied += 1;
        }
        else{
            message = " lost to ";
            this.lost += 1;
        }
        played += 1;
        if (otherTeam != null){
            System.out.println(this.getName() + message + otherTeam.getName());
            otherTeam.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won*3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        }
        else if (this.ranking() < team.ranking()){
            return 1;
        }
        else{
            return 0;
        }

    }
}
