package at.ac.hcw.midterm02exercises.pocketmonster;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private PocketMonster[] monsters;
    private final Player player1;
    private final Player player2;
    private Random random = new Random();

    public Game(Player player, Player player2, PocketMonster[] monsters) {
        this.player1 = player;
        this.player2 = player2;
        this.monsters = monsters;
    }

    public PocketMonster spawn(){
        int idx = random.nextInt(monsters.length);
        return this.monsters[idx];
    }

    public void makeMove(PocketMonster[] monsters, Scanner scanner){
        scanner.nextLine();
    }
    public boolean throwBallAt(Ball b, PocketMonster mon){
        int randomCatch = random.nextInt(101);

        if ( randomCatch - mon.getCatchDifficulty() > 50 ){
            return true;
        }

        return false;
    }
}
