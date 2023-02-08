package dev.cooley;

public class Main {
    public static void main(String[] args){

        //Create leagye
        League<SoccerPlayer> barclaysPrem = new League<>("Barclays Premier League");

        //Create teams
        Team<SoccerPlayer> manU = new Team("Manchester United");
        Team<SoccerPlayer> manC = new Team("Manchester City");
        Team<SoccerPlayer> ars = new Team("Arsenal");
        Team<SoccerPlayer> tot = new Team("Tottenham");
        Team<SoccerPlayer> chel = new Team("Chelsea");
        Team<SoccerPlayer> liv = new Team("Liverpool");
        Team<SoccerPlayer> newCastle = new Team("Newcastle United");

        //Test out different type of team
        Team<FootballPlayer> saints = new Team("Saints");

        //Add teams
        barclaysPrem.addTeam(manU);
        barclaysPrem.addTeam(manC);
        barclaysPrem.addTeam(ars);
        barclaysPrem.addTeam(tot);
        barclaysPrem.addTeam(chel);
        barclaysPrem.addTeam(liv);
        barclaysPrem.addTeam(newCastle);

        //Testing duplicate adding
        barclaysPrem.addTeam(newCastle);


        //Unable to do bc it doesn't match the generic parametrized type
        //barclaysPrem.addTeam(saints);

        //Manchester United results
        barclaysPrem.recordResult(manU, liv, 4, 0);
        barclaysPrem.recordResult(manU, tot, 2, 1);
        barclaysPrem.recordResult(manU, newCastle, 2, 2);
        barclaysPrem.recordResult(manU, manC, 1, 2);
        barclaysPrem.recordResult(manU, ars, 3, 2);

        //Arsenal results
        barclaysPrem.recordResult(ars, manC, 2, 1);
        barclaysPrem.recordResult(ars, chel, 3, 1);
        barclaysPrem.recordResult(ars, tot, 2, 1);
        barclaysPrem.recordResult(ars, liv, 4, 1);
        barclaysPrem.recordResult(ars, newCastle, 2, 2);

        //Chelsea results
        barclaysPrem.recordResult(chel, manC, 1, 3);
        barclaysPrem.recordResult(chel, manU, 2, 3);
        barclaysPrem.recordResult(chel, newCastle, 1, 2);
        barclaysPrem.recordResult(chel, liv, 3, 2);
        barclaysPrem.recordResult(chel, tot, 2, 2);

        //Tottenham Results
        barclaysPrem.recordResult(tot, newCastle, 2, 2);
        barclaysPrem.recordResult(tot, liv, 2, 1);
        barclaysPrem.recordResult(tot, manC, 2, 2);


        //Liverpool results
        barclaysPrem.recordResult(liv, newCastle, 2, 3);
        barclaysPrem.recordResult(liv, manC, 2, 2);

        //Newcastle result
        barclaysPrem.recordResult(newCastle, manC, 2, 4);




        //Print Table
        barclaysPrem.printTable();

    }
}
