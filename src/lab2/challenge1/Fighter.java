package lab2.challenge1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;
    private static int numberOfFighters = 0;

    public Fighter(String name, int health, int damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
        numberOfFighters++; //update the number of instances created
    }

    public void attack(Fighter opponent){
        opponent.health = opponent.health - this.damagePerAttack;
    }
    public String toSring(){
        return "Name: " + name + " health " + health + " damagePerAttack " + damagePerAttack;
    }

    public int getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }

    public static int getNumberOfFighters(){
        return numberOfFighters;
    }
}//end-class
