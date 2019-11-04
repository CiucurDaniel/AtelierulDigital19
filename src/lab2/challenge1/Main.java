package lab2.challenge1;

import lab2.challenge1.BoxingMatch;
import lab2.challenge1.Fighter;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Scorpion", 100, 20);
        Fighter f2 = new Fighter("Goro", 100, 15 );

        BoxingMatch boxingMatch = new BoxingMatch( f1, f2);
        System.out.println("The winner is: " + boxingMatch.fight());

        System.out.println("Number of fighters created are: " + Fighter.getNumberOfFighters());
    }
}
