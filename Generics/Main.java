package dev.cooley;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //This array list can contain any object, not just an integer. This is called a raw type
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add("Hello");

        System.out.println(items);

        System.out.println("The class type of element 0 is " + items.get(0).getClass());

        //It is much better practice to specify the type. This is called parametrized type
        //Type safety prevents bugs from large codebases

        ArrayList<Integer> items2 = new ArrayList<>();
        items2.add(1);
        items2.add(2);
        items2.add(3);
        items2.add(4);
        items2.add(5);

        printDoublesBetter(items2);

        //Using the teams and players classes to demonstrate how self made generics work

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer conor = new BaseballPlayer("Conor");
        SoccerPlayer harrison = new SoccerPlayer("Harrison");

        Team<FootballPlayer> saints = new Team<>("Saints");
        saints.addPlayer(joe);

        Team<BaseballPlayer> nats = new Team<>("Washington DC Nationals");
        nats.addPlayer(conor);

        Team<SoccerPlayer> napoli = new Team<>("Napoli");
        napoli.addPlayer(harrison);

        System.out.println("Number of players on Napoli: " + napoli.numPlayers());

        Team<SoccerPlayer> juve = new Team<>("Juventus");

        napoli.matchResult(juve, 3, 1);

        System.out.println("Juve points: " + juve.ranking());

        System.out.println("Napoli points " + napoli.ranking());

        //This will not work since I specified in the matchResult function that the otherTeam must have same type
        // T as the class does
        //napoli.matchResult(nats, 4, 2);

        //Without bounded type parameters, below two lines would not show errors, but would throw exception when compiled
        //Team<String> brokenTeam = new Team<>();
        //brokenTeam.addPlayer("Doesn't work");

        Team<SoccerPlayer> torino = new Team<>("Torino");
        Team<SoccerPlayer> acmilan = new Team<>("A.C. Milan");
        Team<SoccerPlayer> inter = new Team<>("Inter");

        System.out.println(napoli.compareTo(juve));
        System.out.println(juve.compareTo(napoli));
        System.out.println(inter.compareTo(acmilan));


    }


    //The parameter for this function does not follow type safety
    public static void printDoubledAList(ArrayList list){
        for (Object i: list){
            System.out.println((Integer) i*2);
        }
    }

    //Much better to include a parametrized type, even for the argument to a function
    public static void printDoublesBetter(ArrayList<Integer> list){
        for (int i: list){
            System.out.println(2*i);
        }
    }

}



