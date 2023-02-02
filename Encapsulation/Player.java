package dev.cooley;

public class Player {

    //Without the private keyword these fields are not encapsulated.
    //If they were public instead, then they could be accessed by main method or other places in code that
    // have created a player object.

    //By encapsulating, we ensure that the player's information is only modified by code that is supposed to
    // i.e. functions within the player class. This helps to keep the algorithms/logic of calculating separate
    // from other parts of the program

    //Other big problem is that if I modify the names of the player fields, any calling code in other classes
    // will now have errors. In big applications this is a problem because it would be wasteful to have to look at
    // the new name and change all the times it was used in calling code outside the class.
    private String playerName;
    private int health;
    private String weapon;

    public Player(){
        this("Bob", 100, "Chicken-Sword");
    }

    public Player(String playerName){
        this(playerName, 100, "Sword");
    }

    public Player(String playerName, int health, String weapon) {
        this.playerName = playerName;
        if (health < 1){
            this.health = 1;
        }
        else if (health > 100){
            this.health = 100;
        }
        else{
            this.health = health;
        }
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + playerName + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public void loseHealth(int damage){
        if (damage > health){
            health = 0;
            System.out.println("Player has died");
        }
        else{
            health = health - damage;
        }
    }

    public void restoreHealth(int extraHealth){
        if (health + extraHealth > 100){
            health = 100;
        }
        else{
            health = health + extraHealth;
        }
    }

    public int healthRemaining(){
        return health;
    }

}
